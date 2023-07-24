.class public final synthetic Le/f/a/a/j/j0/k/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/j0/k/f0;


# instance fields
.field public final a:Le/f/a/a/j/j0/k/i0;

.field public final b:Ljava/util/List;

.field public final c:Le/f/a/a/j/x;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/k/i0;Ljava/util/List;Le/f/a/a/j/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/k/q;->a:Le/f/a/a/j/j0/k/i0;

    iput-object p2, p0, Le/f/a/a/j/j0/k/q;->b:Ljava/util/List;

    iput-object p3, p0, Le/f/a/a/j/j0/k/q;->c:Le/f/a/a/j/x;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/k/i0;Ljava/util/List;Le/f/a/a/j/x;)Le/f/a/a/j/j0/k/f0;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/k/q;

    invoke-direct {v0, p0, p1, p2}, Le/f/a/a/j/j0/k/q;-><init>(Le/f/a/a/j/j0/k/i0;Ljava/util/List;Le/f/a/a/j/x;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Le/f/a/a/j/j0/k/q;->a:Le/f/a/a/j/j0/k/i0;

    iget-object v1, p0, Le/f/a/a/j/j0/k/q;->b:Ljava/util/List;

    iget-object v2, p0, Le/f/a/a/j/j0/k/q;->c:Le/f/a/a/j/x;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/i0;Ljava/util/List;Le/f/a/a/j/x;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
