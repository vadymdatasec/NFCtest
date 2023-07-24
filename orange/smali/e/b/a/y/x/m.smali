.class public final Le/b/a/y/x/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Transcode:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/y/v0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/n;",
            ">;"
        }
    .end annotation
.end field

.field public c:Le/b/a/j;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public h:Le/b/a/y/x/r;

.field public i:Le/b/a/y/r;

.field public j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/v<",
            "*>;>;"
        }
    .end annotation
.end field

.field public k:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscode;>;"
        }
    .end annotation
.end field

.field public l:Z

.field public m:Z

.field public n:Le/b/a/y/n;

.field public o:Le/b/a/n;

.field public p:Le/b/a/y/x/c0;

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/m;->a:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/m;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/x/y0;)Le/b/a/y/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/x/y0<",
            "TZ;>;)",
            "Le/b/a/y/u<",
            "TZ;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/Registry;->a(Le/b/a/y/x/y0;)Le/b/a/y/u;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Object;)Le/b/a/y/w/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Le/b/a/y/w/g<",
            "TT;>;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Object;)Le/b/a/y/w/g;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Class;)Le/b/a/y/x/v0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TData;>;)",
            "Le/b/a/y/x/v0<",
            "TData;*TTranscode;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    iget-object v1, p0, Le/b/a/y/x/m;->g:Ljava/lang/Class;

    iget-object v2, p0, Le/b/a/y/x/m;->k:Ljava/lang/Class;

    invoke-virtual {v0, p1, v1, v2}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/x/v0;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/io/File;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Le/b/a/y/y/w0<",
            "Ljava/io/File;",
            "*>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;
        }
    .end annotation

    .line 31
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 2

    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    .line 16
    iput-object v0, p0, Le/b/a/y/x/m;->d:Ljava/lang/Object;

    .line 17
    iput-object v0, p0, Le/b/a/y/x/m;->n:Le/b/a/y/n;

    .line 18
    iput-object v0, p0, Le/b/a/y/x/m;->g:Ljava/lang/Class;

    .line 19
    iput-object v0, p0, Le/b/a/y/x/m;->k:Ljava/lang/Class;

    .line 20
    iput-object v0, p0, Le/b/a/y/x/m;->i:Le/b/a/y/r;

    .line 21
    iput-object v0, p0, Le/b/a/y/x/m;->o:Le/b/a/n;

    .line 22
    iput-object v0, p0, Le/b/a/y/x/m;->j:Ljava/util/Map;

    .line 23
    iput-object v0, p0, Le/b/a/y/x/m;->p:Le/b/a/y/x/c0;

    .line 24
    iget-object v0, p0, Le/b/a/y/x/m;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Le/b/a/y/x/m;->l:Z

    .line 26
    iget-object v1, p0, Le/b/a/y/x/m;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 27
    iput-boolean v0, p0, Le/b/a/y/x/m;->m:Z

    return-void
.end method

.method public a(Le/b/a/j;Ljava/lang/Object;Le/b/a/y/n;IILe/b/a/y/x/c0;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/n;Le/b/a/y/r;Ljava/util/Map;ZZLe/b/a/y/x/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/j;",
            "Ljava/lang/Object;",
            "Le/b/a/y/n;",
            "II",
            "Le/b/a/y/x/c0;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Le/b/a/n;",
            "Le/b/a/y/r;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/y/v<",
            "*>;>;ZZ",
            "Le/b/a/y/x/r;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    .line 2
    iput-object p2, p0, Le/b/a/y/x/m;->d:Ljava/lang/Object;

    .line 3
    iput-object p3, p0, Le/b/a/y/x/m;->n:Le/b/a/y/n;

    .line 4
    iput p4, p0, Le/b/a/y/x/m;->e:I

    .line 5
    iput p5, p0, Le/b/a/y/x/m;->f:I

    .line 6
    iput-object p6, p0, Le/b/a/y/x/m;->p:Le/b/a/y/x/c0;

    .line 7
    iput-object p7, p0, Le/b/a/y/x/m;->g:Ljava/lang/Class;

    .line 8
    iput-object p14, p0, Le/b/a/y/x/m;->h:Le/b/a/y/x/r;

    .line 9
    iput-object p8, p0, Le/b/a/y/x/m;->k:Ljava/lang/Class;

    .line 10
    iput-object p9, p0, Le/b/a/y/x/m;->o:Le/b/a/n;

    .line 11
    iput-object p10, p0, Le/b/a/y/x/m;->i:Le/b/a/y/r;

    .line 12
    iput-object p11, p0, Le/b/a/y/x/m;->j:Ljava/util/Map;

    .line 13
    iput-boolean p12, p0, Le/b/a/y/x/m;->q:Z

    .line 14
    iput-boolean p13, p0, Le/b/a/y/x/m;->r:Z

    return-void
.end method

.method public a(Le/b/a/y/n;)Z
    .locals 5

    .line 32
    invoke-virtual {p0}, Le/b/a/y/x/m;->g()Ljava/util/List;

    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 34
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/b/a/y/y/v0;

    .line 35
    iget-object v4, v4, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    invoke-interface {v4, p1}, Le/b/a/y/n;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public b(Ljava/lang/Object;)Le/b/a/y/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(TX;)",
            "Le/b/a/y/d<",
            "TX;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;
        }
    .end annotation

    .line 10
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Object;)Le/b/a/y/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Class;)Le/b/a/y/v;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TZ;>;)",
            "Le/b/a/y/v<",
            "TZ;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/x/m;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/v;

    if-nez v0, :cond_1

    .line 3
    iget-object v1, p0, Le/b/a/y/x/m;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/v;

    :cond_1
    if-nez v0, :cond_4

    .line 6
    iget-object v0, p0, Le/b/a/y/x/m;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Le/b/a/y/x/m;->q:Z

    if-nez v0, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Missing transformation for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". If you wish to ignore unknown resource types, use the optional transformation methods."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_3
    :goto_0
    invoke-static {}, Le/b/a/y/z/d;->a()Le/b/a/y/z/d;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v0
.end method

.method public b()Le/b/a/y/x/f1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->a()Le/b/a/y/x/f1/b;

    move-result-object v0

    return-object v0
.end method

.method public b(Le/b/a/y/x/y0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "*>;)Z"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/Registry;->b(Le/b/a/y/x/y0;)Z

    move-result p1

    return p1
.end method

.method public c()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/b/a/y/n;",
            ">;"
        }
    .end annotation

    .line 2
    iget-boolean v0, p0, Le/b/a/y/x/m;->m:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Le/b/a/y/x/m;->m:Z

    .line 4
    iget-object v0, p0, Le/b/a/y/x/m;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 5
    invoke-virtual {p0}, Le/b/a/y/x/m;->g()Ljava/util/List;

    move-result-object v0

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 7
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/b/a/y/y/v0;

    .line 8
    iget-object v5, p0, Le/b/a/y/x/m;->b:Ljava/util/List;

    iget-object v6, v4, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 9
    iget-object v5, p0, Le/b/a/y/x/m;->b:Ljava/util/List;

    iget-object v6, v4, Le/b/a/y/y/v0;->a:Le/b/a/y/n;

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 v5, 0x0

    .line 10
    :goto_1
    iget-object v6, v4, Le/b/a/y/y/v0;->b:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    .line 11
    iget-object v6, p0, Le/b/a/y/x/m;->b:Ljava/util/List;

    iget-object v7, v4, Le/b/a/y/y/v0;->b:Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 12
    iget-object v6, p0, Le/b/a/y/x/m;->b:Ljava/util/List;

    iget-object v7, v4, Le/b/a/y/y/v0;->b:Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 13
    :cond_3
    iget-object v0, p0, Le/b/a/y/x/m;->b:Ljava/util/List;

    return-object v0
.end method

.method public c(Ljava/lang/Class;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/b/a/y/x/m;->a(Ljava/lang/Class;)Le/b/a/y/x/v0;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d()Le/b/a/y/x/g1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->h:Le/b/a/y/x/r;

    invoke-interface {v0}, Le/b/a/y/x/r;->a()Le/b/a/y/x/g1/c;

    move-result-object v0

    return-object v0
.end method

.method public e()Le/b/a/y/x/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->p:Le/b/a/y/x/c0;

    return-object v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/y/x/m;->f:I

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/b/a/y/y/v0<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Le/b/a/y/x/m;->l:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/b/a/y/x/m;->l:Z

    .line 3
    iget-object v0, p0, Le/b/a/y/x/m;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    iget-object v1, p0, Le/b/a/y/x/m;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/b/a/y/y/w0;

    .line 7
    iget-object v4, p0, Le/b/a/y/x/m;->d:Ljava/lang/Object;

    iget v5, p0, Le/b/a/y/x/m;->e:I

    iget v6, p0, Le/b/a/y/x/m;->f:I

    iget-object v7, p0, Le/b/a/y/x/m;->i:Le/b/a/y/r;

    invoke-interface {v3, v4, v5, v6, v7}, Le/b/a/y/y/w0;->a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 8
    iget-object v4, p0, Le/b/a/y/x/m;->a:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, p0, Le/b/a/y/x/m;->a:Ljava/util/List;

    return-object v0
.end method

.method public h()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public i()Le/b/a/y/r;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->i:Le/b/a/y/r;

    return-object v0
.end method

.method public j()Le/b/a/n;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->o:Le/b/a/n;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->c:Le/b/a/j;

    .line 2
    invoke-virtual {v0}, Le/b/a/j;->g()Lcom/bumptech/glide/Registry;

    move-result-object v0

    iget-object v1, p0, Le/b/a/y/x/m;->d:Ljava/lang/Object;

    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Le/b/a/y/x/m;->g:Ljava/lang/Class;

    iget-object v3, p0, Le/b/a/y/x/m;->k:Ljava/lang/Class;

    invoke-virtual {v0, v1, v2, v3}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public l()Le/b/a/y/n;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->n:Le/b/a/y/n;

    return-object v0
.end method

.method public m()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/m;->k:Ljava/lang/Class;

    return-object v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/y/x/m;->e:I

    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/y/x/m;->r:Z

    return v0
.end method
