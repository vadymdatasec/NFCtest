.class public final Le/f/b/b/c0;
.super Le/f/b/b/n;
.source "SourceFile"

# interfaces
.implements Le/f/b/b/l0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/n<",
        "TK;TV;",
        "Le/f/b/b/c0<",
        "TK;TV;>;>;",
        "Le/f/b/b/l0<",
        "TK;TV;",
        "Le/f/b/b/c0<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public volatile d:Le/f/b/b/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/m0<",
            "TK;TV;",
            "Le/f/b/b/c0<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILe/f/b/b/c0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I",
            "Le/f/b/b/c0<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2, p3}, Le/f/b/b/n;-><init>(Ljava/lang/Object;ILe/f/b/b/r;)V

    .line 2
    invoke-static {}, Le/f/b/b/q;->b()Le/f/b/b/m0;

    move-result-object p1

    iput-object p1, p0, Le/f/b/b/c0;->d:Le/f/b/b/m0;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/ref/ReferenceQueue;Le/f/b/b/c0;)Le/f/b/b/c0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;",
            "Le/f/b/b/c0<",
            "TK;TV;>;)",
            "Le/f/b/b/c0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 4
    new-instance v0, Le/f/b/b/c0;

    iget-object v1, p0, Le/f/b/b/n;->a:Ljava/lang/Object;

    iget v2, p0, Le/f/b/b/n;->b:I

    invoke-direct {v0, v1, v2, p2}, Le/f/b/b/c0;-><init>(Ljava/lang/Object;ILe/f/b/b/c0;)V

    .line 5
    iget-object p2, p0, Le/f/b/b/c0;->d:Le/f/b/b/m0;

    invoke-interface {p2, p1, v0}, Le/f/b/b/m0;->a(Ljava/lang/ref/ReferenceQueue;Le/f/b/b/r;)Le/f/b/b/m0;

    move-result-object p1

    iput-object p1, v0, Le/f/b/b/c0;->d:Le/f/b/b/m0;

    return-object v0
.end method

.method public a()Le/f/b/b/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/m0<",
            "TK;TV;",
            "Le/f/b/b/c0<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Le/f/b/b/c0;->d:Le/f/b/b/m0;

    return-object v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;",
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/c0;->d:Le/f/b/b/m0;

    .line 2
    new-instance v1, Le/f/b/b/n0;

    invoke-direct {v1, p2, p1, p0}, Le/f/b/b/n0;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;Le/f/b/b/r;)V

    iput-object v1, p0, Le/f/b/b/c0;->d:Le/f/b/b/m0;

    .line 3
    invoke-interface {v0}, Le/f/b/b/m0;->clear()V

    return-void
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/c0;->d:Le/f/b/b/m0;

    invoke-interface {v0}, Le/f/b/b/m0;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method