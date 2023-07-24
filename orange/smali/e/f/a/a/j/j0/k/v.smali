.class public final synthetic Le/f/a/a/j/j0/k/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/k/h0;


# instance fields
.field public final a:Le/f/a/a/j/j0/k/p0;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/k/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/k/v;->a:Le/f/a/a/j/j0/k/p0;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/k/p0;)Le/f/a/a/j/j0/k/h0;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/k/v;

    invoke-direct {v0, p0}, Le/f/a/a/j/j0/k/v;-><init>(Le/f/a/a/j/j0/k/p0;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/a/a/j/j0/k/v;->a:Le/f/a/a/j/j0/k/p0;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method
