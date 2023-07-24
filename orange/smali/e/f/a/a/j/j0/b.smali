.class public final synthetic Le/f/a/a/j/j0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/k0/a;


# instance fields
.field public final a:Le/f/a/a/j/j0/c;

.field public final b:Le/f/a/a/j/x;

.field public final c:Le/f/a/a/j/q;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/j/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/b;->a:Le/f/a/a/j/j0/c;

    iput-object p2, p0, Le/f/a/a/j/j0/b;->b:Le/f/a/a/j/x;

    iput-object p3, p0, Le/f/a/a/j/j0/b;->c:Le/f/a/a/j/q;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/j/q;)Le/f/a/a/j/k0/a;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/b;

    invoke-direct {v0, p0, p1, p2}, Le/f/a/a/j/j0/b;-><init>(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/j/q;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Le/f/a/a/j/j0/b;->a:Le/f/a/a/j/j0/c;

    iget-object v1, p0, Le/f/a/a/j/j0/b;->b:Le/f/a/a/j/x;

    iget-object v2, p0, Le/f/a/a/j/j0/b;->c:Le/f/a/a/j/q;

    invoke-static {v0, v1, v2}, Le/f/a/a/j/j0/c;->a(Le/f/a/a/j/j0/c;Le/f/a/a/j/x;Le/f/a/a/j/q;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
