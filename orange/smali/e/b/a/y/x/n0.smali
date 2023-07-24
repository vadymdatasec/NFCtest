.class public final Le/b/a/y/x/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Le/b/a/y/x/m0;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/x/m0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0}, Le/b/a/y/x/n0;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/b/a/y/x/m0;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    return-void
.end method

.method public static c(Le/b/a/c0/k;)Le/b/a/y/x/m0;
    .locals 2

    .line 1
    new-instance v0, Le/b/a/y/x/m0;

    invoke-static {}, Le/b/a/e0/i;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Le/b/a/y/x/m0;-><init>(Le/b/a/c0/k;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public a()Le/b/a/y/x/n0;
    .locals 3

    .line 3
    new-instance v0, Le/b/a/y/x/n0;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v1}, Le/b/a/y/x/n0;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public a(Le/b/a/c0/k;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    new-instance v1, Le/b/a/y/x/m0;

    invoke-direct {v1, p1, p2}, Le/b/a/y/x/m0;-><init>(Le/b/a/c0/k;Ljava/util/concurrent/Executor;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Le/b/a/c0/k;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    invoke-static {p1}, Le/b/a/y/x/n0;->c(Le/b/a/c0/k;)Le/b/a/y/x/m0;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b(Le/b/a/c0/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    invoke-static {p1}, Le/b/a/y/x/n0;->c(Le/b/a/c0/k;)Le/b/a/y/x/m0;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Le/b/a/y/x/m0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/n0;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
