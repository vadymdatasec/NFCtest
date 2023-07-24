.class public final synthetic Le/f/a/a/j/j0/j/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/k0/a;


# instance fields
.field public final a:Le/f/a/a/j/j0/k/e;


# direct methods
.method public constructor <init>(Le/f/a/a/j/j0/k/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/a/j/j0/j/q;->a:Le/f/a/a/j/j0/k/e;

    return-void
.end method

.method public static a(Le/f/a/a/j/j0/k/e;)Le/f/a/a/j/k0/a;
    .locals 1

    new-instance v0, Le/f/a/a/j/j0/j/q;

    invoke-direct {v0, p0}, Le/f/a/a/j/j0/j/q;-><init>(Le/f/a/a/j/j0/k/e;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/a/a/j/j0/j/q;->a:Le/f/a/a/j/j0/k/e;

    invoke-interface {v0}, Le/f/a/a/j/j0/k/e;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
