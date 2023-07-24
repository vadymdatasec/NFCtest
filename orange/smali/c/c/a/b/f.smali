.class public abstract Lc/c/a/b/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lc/c/a/b/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "Lc/c/a/b/g<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public b:Lc/c/a/b/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/c/a/b/d<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:Lc/c/a/b/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/c/a/b/d<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/c/a/b/d;Lc/c/a/b/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/c/a/b/d<",
            "TK;TV;>;",
            "Lc/c/a/b/d<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/c/a/b/f;->b:Lc/c/a/b/d;

    .line 3
    iput-object p1, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    return-void
.end method


# virtual methods
.method public final a()Lc/c/a/b/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/c/a/b/d<",
            "TK;TV;>;"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    iget-object v1, p0, Lc/c/a/b/f;->b:Lc/c/a/b/d;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0, v0}, Lc/c/a/b/f;->c(Lc/c/a/b/d;)Lc/c/a/b/d;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lc/c/a/b/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/c/a/b/d<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/c/a/b/f;->b:Lc/c/a/b/d;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    .line 3
    iput-object v0, p0, Lc/c/a/b/f;->b:Lc/c/a/b/d;

    .line 4
    :cond_0
    iget-object v0, p0, Lc/c/a/b/f;->b:Lc/c/a/b/d;

    if-ne v0, p1, :cond_1

    .line 5
    invoke-virtual {p0, v0}, Lc/c/a/b/f;->b(Lc/c/a/b/d;)Lc/c/a/b/d;

    move-result-object v0

    iput-object v0, p0, Lc/c/a/b/f;->b:Lc/c/a/b/d;

    .line 6
    :cond_1
    iget-object v0, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    if-ne v0, p1, :cond_2

    .line 7
    invoke-virtual {p0}, Lc/c/a/b/f;->a()Lc/c/a/b/d;

    move-result-object p1

    iput-object p1, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    :cond_2
    return-void
.end method

.method public abstract b(Lc/c/a/b/d;)Lc/c/a/b/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/c/a/b/d<",
            "TK;TV;>;)",
            "Lc/c/a/b/d<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public abstract c(Lc/c/a/b/d;)Lc/c/a/b/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/c/a/b/d<",
            "TK;TV;>;)",
            "Lc/c/a/b/d<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/c/a/b/f;->next()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    .line 3
    invoke-virtual {p0}, Lc/c/a/b/f;->a()Lc/c/a/b/d;

    move-result-object v1

    iput-object v1, p0, Lc/c/a/b/f;->c:Lc/c/a/b/d;

    return-object v0
.end method
