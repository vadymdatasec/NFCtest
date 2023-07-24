.class public final synthetic Le/f/a/a/j/j0/j/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/k0/a;


# instance fields
.field public final a:Le/f/a/a/j/j0/j/s;

.field public final b:Le/f/a/a/j/x;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/j/o;->a:Le/f/a/a/j/j0/j/s;

    iput-object p2, p0, Le/f/a/a/j/j0/j/o;->b:Le/f/a/a/j/x;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;)Le/f/a/a/j/k0/a;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/j/o;

    invoke-direct {v0, p0, p1}, Le/f/a/a/j/j0/j/o;-><init>(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Le/f/a/a/j/j0/j/o;->a:Le/f/a/a/j/j0/j/s;

    iget-object v1, p0, Le/f/a/a/j/j0/j/o;->b:Le/f/a/a/j/x;

    invoke-static {v0, v1}, Le/f/a/a/j/j0/j/s;->a(Le/f/a/a/j/j0/j/s;Le/f/a/a/j/x;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method
