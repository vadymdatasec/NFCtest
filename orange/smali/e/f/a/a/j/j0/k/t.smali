.class public final synthetic Le/f/a/a/j/j0/k/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/k/h0;


# instance fields
.field public final a:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/k/t;->a:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;)Le/f/a/a/j/j0/k/h0;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/k/t;

    invoke-direct {v0, p0}, Le/f/a/a/j/j0/k/t;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/a/a/j/j0/k/t;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0}, Le/f/a/a/j/j0/k/i0;->b(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
