.class public Le/f/c/k/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/c/k/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/k/e<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/f/c/k/r;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/f/c/k/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/c/k/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/k/e<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/f/c/k/r;->b:Ljava/util/Set;

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/f/c/k/r;->c:Ljava/util/Set;

    .line 4
    iput-object p1, p0, Le/f/c/k/r;->a:Le/f/c/k/e;

    return-void
.end method


# virtual methods
.method public a()Le/f/c/k/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/c/k/e<",
            "*>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/k/r;->a:Le/f/c/k/e;

    return-object v0
.end method

.method public a(Le/f/c/k/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/k/r;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Le/f/c/k/r;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/k/r;->b:Ljava/util/Set;

    return-object v0
.end method

.method public b(Le/f/c/k/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/k/r;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Le/f/c/k/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/k/r;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public c()Z
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/c/k/r;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/k/r;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method
