.class public final synthetic Le/f/a/a/j/j0/k/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/k/f0;


# instance fields
.field public final a:Le/f/a/a/j/j0/k/i0;

.field public final b:Le/f/a/a/j/x;

.field public final c:Le/f/a/a/j/q;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/k/i0;Le/f/a/a/j/x;Le/f/a/a/j/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/k/z;->a:Le/f/a/a/j/j0/k/i0;

    iput-object p2, p0, Le/f/a/a/j/j0/k/z;->b:Le/f/a/a/j/x;

    iput-object p3, p0, Le/f/a/a/j/j0/k/z;->c:Le/f/a/a/j/q;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/k/i0;Le/f/a/a/j/x;Le/f/a/a/j/q;)Le/f/a/a/j/j0/k/f0;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/k/z;

    invoke-direct {v0, p0, p1, p2}, Le/f/a/a/j/j0/k/z;-><init>(Le/f/a/a/j/j0/k/i0;Le/f/a/a/j/x;Le/f/a/a/j/q;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Le/f/a/a/j/j0/k/z;->a:Le/f/a/a/j/j0/k/i0;

    iget-object v1, p0, Le/f/a/a/j/j0/k/z;->b:Le/f/a/a/j/x;

    iget-object v2, p0, Le/f/a/a/j/j0/k/z;->c:Le/f/a/a/j/q;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/i0;Le/f/a/a/j/x;Le/f/a/a/j/q;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
