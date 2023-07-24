.class public final synthetic Le/f/a/a/j/j0/k/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/k/f0;


# instance fields
.field public final a:J

.field public final b:Le/f/a/a/j/x;


# direct methods
.method public constructor <init>(JLe/f/a/a/j/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le/f/a/a/j/j0/k/m;->a:J

    iput-object p3, p0, Le/f/a/a/j/j0/k/m;->b:Le/f/a/a/j/x;

    return-void
.end method

.method public static a(JLe/f/a/a/j/x;)Le/f/a/a/j/j0/k/f0;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/k/m;

    invoke-direct {v0, p0, p1, p2}, Le/f/a/a/j/j0/k/m;-><init>(JLe/f/a/a/j/x;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Le/f/a/a/j/j0/k/m;->a:J

    iget-object v2, p0, Le/f/a/a/j/j0/k/m;->b:Le/f/a/a/j/x;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Le/f/a/a/j/j0/k/i0;->a(JLe/f/a/a/j/x;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
