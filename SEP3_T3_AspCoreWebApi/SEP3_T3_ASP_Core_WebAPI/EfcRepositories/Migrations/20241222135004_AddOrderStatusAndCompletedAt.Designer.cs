﻿// <auto-generated />
using System;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using Npgsql.EntityFrameworkCore.PostgreSQL.Metadata;
using SEP3_T3_ASP_Core_WebAPI;

#nullable disable

namespace EfcRepositories.Migrations
{
    [DbContext(typeof(AppDbContext))]
    [Migration("20241222135004_AddOrderStatusAndCompletedAt")]
    partial class AddOrderStatusAndCompletedAt
    {
        /// <inheritdoc />
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "9.0.0")
                .HasAnnotation("Relational:MaxIdentifierLength", 63);

            NpgsqlModelBuilderExtensions.UseIdentityByDefaultColumns(modelBuilder);

            modelBuilder.Entity("Entities.Item", b =>
                {
                    b.Property<int>("ItemId")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("integer");

                    NpgsqlPropertyBuilderExtensions.UseIdentityByDefaultColumn(b.Property<int>("ItemId"));

                    b.Property<string>("Description")
                        .HasColumnType("text");

                    b.Property<bool>("IsAvailable")
                        .HasColumnType("boolean");

                    b.Property<string>("ItemName")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<int>("QuantityInStore")
                        .HasColumnType("integer");

                    b.HasKey("ItemId");

                    b.ToTable("Items");
                });

            modelBuilder.Entity("Entities.Order", b =>
                {
                    b.Property<int>("OrderId")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("integer");

                    NpgsqlPropertyBuilderExtensions.UseIdentityByDefaultColumn(b.Property<int>("OrderId"));

                    b.Property<DateTimeOffset?>("CompletedAt")
                        .HasColumnType("timestamp with time zone");

                    b.Property<DateTimeOffset>("CreatedAt")
                        .HasColumnType("timestamp with time zone");

                    b.Property<int>("CreatedById")
                        .HasColumnType("integer");

                    b.Property<DateTime>("DeliveryDate")
                        .HasColumnType("timestamp with time zone");

                    b.Property<int>("OrderStatus")
                        .HasColumnType("integer");

                    b.Property<int?>("UserId")
                        .HasColumnType("integer");

                    b.HasKey("OrderId");

                    b.HasIndex("CreatedById");

                    b.HasIndex("UserId");

                    b.ToTable("Orders");
                });

            modelBuilder.Entity("Entities.OrderItem", b =>
                {
                    b.Property<int>("OrderId")
                        .HasColumnType("integer");

                    b.Property<int>("ItemId")
                        .HasColumnType("integer");

                    b.Property<int>("OrderItemId")
                        .HasColumnType("integer");

                    b.Property<int>("QuantityToPick")
                        .HasColumnType("integer");

                    b.Property<int>("TotalQuantity")
                        .HasColumnType("integer");

                    b.HasKey("OrderId", "ItemId");

                    b.HasIndex("ItemId");

                    b.ToTable("OrderItems");
                });

            modelBuilder.Entity("Entities.User", b =>
                {
                    b.Property<int>("UserId")
                        .ValueGeneratedOnAdd()
                        .HasColumnType("integer");

                    NpgsqlPropertyBuilderExtensions.UseIdentityByDefaultColumn(b.Property<int>("UserId"));

                    b.Property<string>("Password")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("UserName")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<int>("UserRole")
                        .HasColumnType("integer");

                    b.HasKey("UserId");

                    b.ToTable("Users");
                });

            modelBuilder.Entity("Entities.Order", b =>
                {
                    b.HasOne("Entities.User", "CreatedBy")
                        .WithMany()
                        .HasForeignKey("CreatedById")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("Entities.User", "AssignedUser")
                        .WithMany("Orders")
                        .HasForeignKey("UserId")
                        .OnDelete(DeleteBehavior.Cascade);

                    b.Navigation("AssignedUser");

                    b.Navigation("CreatedBy");
                });

            modelBuilder.Entity("Entities.OrderItem", b =>
                {
                    b.HasOne("Entities.Item", "Item")
                        .WithMany("OrderItems")
                        .HasForeignKey("ItemId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.HasOne("Entities.Order", "Order")
                        .WithMany("OrderItems")
                        .HasForeignKey("OrderId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.Navigation("Item");

                    b.Navigation("Order");
                });

            modelBuilder.Entity("Entities.Item", b =>
                {
                    b.Navigation("OrderItems");
                });

            modelBuilder.Entity("Entities.Order", b =>
                {
                    b.Navigation("OrderItems");
                });

            modelBuilder.Entity("Entities.User", b =>
                {
                    b.Navigation("Orders");
                });
#pragma warning restore 612, 618
        }
    }
}
