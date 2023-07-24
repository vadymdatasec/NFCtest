.class public Lcom/bumptech/glide/Registry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/Registry$NoImageHeaderParserException;,
        Lcom/bumptech/glide/Registry$MissingComponentException;,
        Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;,
        Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;,
        Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/y/a1;

.field public final b:Le/b/a/b0/b;

.field public final c:Le/b/a/b0/g;

.field public final d:Le/b/a/b0/i;

.field public final e:Le/b/a/y/w/j;

.field public final f:Le/b/a/y/z/j/g;

.field public final g:Le/b/a/b0/c;

.field public final h:Le/b/a/b0/e;

.field public final i:Le/b/a/b0/d;

.field public final j:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/b0/e;

    invoke-direct {v0}, Le/b/a/b0/e;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->h:Le/b/a/b0/e;

    .line 3
    new-instance v0, Le/b/a/b0/d;

    invoke-direct {v0}, Le/b/a/b0/d;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->i:Le/b/a/b0/d;

    .line 4
    invoke-static {}, Le/b/a/e0/u/h;->b()Lc/h/m/d;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->j:Lc/h/m/d;

    .line 5
    new-instance v1, Le/b/a/y/y/a1;

    invoke-direct {v1, v0}, Le/b/a/y/y/a1;-><init>(Lc/h/m/d;)V

    iput-object v1, p0, Lcom/bumptech/glide/Registry;->a:Le/b/a/y/y/a1;

    .line 6
    new-instance v0, Le/b/a/b0/b;

    invoke-direct {v0}, Le/b/a/b0/b;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->b:Le/b/a/b0/b;

    .line 7
    new-instance v0, Le/b/a/b0/g;

    invoke-direct {v0}, Le/b/a/b0/g;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->c:Le/b/a/b0/g;

    .line 8
    new-instance v0, Le/b/a/b0/i;

    invoke-direct {v0}, Le/b/a/b0/i;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->d:Le/b/a/b0/i;

    .line 9
    new-instance v0, Le/b/a/y/w/j;

    invoke-direct {v0}, Le/b/a/y/w/j;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->e:Le/b/a/y/w/j;

    .line 10
    new-instance v0, Le/b/a/y/z/j/g;

    invoke-direct {v0}, Le/b/a/y/z/j/g;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->f:Le/b/a/y/z/j/g;

    .line 11
    new-instance v0, Le/b/a/b0/c;

    invoke-direct {v0}, Le/b/a/b0/c;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->g:Le/b/a/b0/c;

    const-string v0, "Animation"

    const-string v1, "Bitmap"

    const-string v2, "BitmapDrawable"

    .line 12
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/util/List;)Lcom/bumptech/glide/Registry;

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->g:Le/b/a/b0/c;

    invoke-virtual {v0, p1}, Le/b/a/b0/c;->a(Lcom/bumptech/glide/load/ImageHeaderParser;)V

    return-object p0
.end method

.method public a(Le/b/a/y/w/f;)Lcom/bumptech/glide/Registry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/w/f<",
            "*>;)",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->e:Le/b/a/y/w/j;

    invoke-virtual {v0, p1}, Le/b/a/y/w/j;->a(Le/b/a/y/w/f;)V

    return-object p0
.end method

.method public a(Ljava/lang/Class;Le/b/a/y/d;)Lcom/bumptech/glide/Registry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TData;>;",
            "Le/b/a/y/d<",
            "TData;>;)",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->b:Le/b/a/b0/b;

    invoke-virtual {v0, p1, p2}, Le/b/a/b0/b;->a(Ljava/lang/Class;Le/b/a/y/d;)V

    return-object p0
.end method

.method public a(Ljava/lang/Class;Le/b/a/y/u;)Lcom/bumptech/glide/Registry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResource:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Le/b/a/y/u<",
            "TTResource;>;)",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    .line 10
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->d:Le/b/a/b0/i;

    invoke-virtual {v0, p1, p2}, Le/b/a/b0/i;->a(Ljava/lang/Class;Le/b/a/y/u;)V

    return-object p0
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "TResource:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TData;>;",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Le/b/a/y/t<",
            "TData;TTResource;>;)",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    const-string v0, "legacy_append"

    .line 2
    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;

    return-object p0
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)Lcom/bumptech/glide/Registry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TModel;>;",
            "Ljava/lang/Class<",
            "TData;>;",
            "Le/b/a/y/y/x0<",
            "TModel;TData;>;)",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->a:Le/b/a/y/y/a1;

    invoke-virtual {v0, p1, p2, p3}, Le/b/a/y/y/a1;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)V

    return-object p0
.end method

.method public a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)Lcom/bumptech/glide/Registry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResource:",
            "Ljava/lang/Object;",
            "Transcode:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Ljava/lang/Class<",
            "TTranscode;>;",
            "Le/b/a/y/z/j/e<",
            "TTResource;TTranscode;>;)",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->f:Le/b/a/y/z/j/g;

    invoke-virtual {v0, p1, p2, p3}, Le/b/a/y/z/j/g;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/z/j/e;)V

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/t;)Lcom/bumptech/glide/Registry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "TResource:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TData;>;",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Le/b/a/y/t<",
            "TData;TTResource;>;)",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->c:Le/b/a/b0/g;

    invoke-virtual {v0, p1, p4, p2, p3}, Le/b/a/b0/g;->a(Ljava/lang/String;Le/b/a/y/t;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object p0
.end method

.method public final a(Ljava/util/List;)Lcom/bumptech/glide/Registry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/bumptech/glide/Registry;"
        }
    .end annotation

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const-string v1, "legacy_prepend_all"

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string p1, "legacy_append"

    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object p1, p0, Lcom/bumptech/glide/Registry;->c:Le/b/a/b0/g;

    invoke-virtual {p1, v0}, Le/b/a/b0/g;->a(Ljava/util/List;)V

    return-object p0
.end method

.method public a(Le/b/a/y/x/y0;)Le/b/a/y/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/x/y0<",
            "TX;>;)",
            "Le/b/a/y/u<",
            "TX;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->d:Le/b/a/b0/i;

    invoke-interface {p1}, Le/b/a/y/x/y0;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/b/a/b0/i;->a(Ljava/lang/Class;)Le/b/a/y/u;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 29
    :cond_0
    new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    invoke-interface {p1}, Le/b/a/y/x/y0;->c()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    throw v0
.end method

.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->g:Le/b/a/b0/c;

    invoke-virtual {v0}, Le/b/a/b0/c;->a()Ljava/util/List;

    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 33
    :cond_0
    new-instance v0, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;

    invoke-direct {v0}, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;-><init>()V

    throw v0
.end method

.method public final a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "TResource:",
            "Ljava/lang/Object;",
            "Transcode:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TData;>;",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Ljava/lang/Class<",
            "TTranscode;>;)",
            "Ljava/util/List<",
            "Le/b/a/y/x/w<",
            "TData;TTResource;TTranscode;>;>;"
        }
    .end annotation

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    iget-object v1, p0, Lcom/bumptech/glide/Registry;->c:Le/b/a/b0/g;

    .line 17
    invoke-virtual {v1, p1, p2}, Le/b/a/b0/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p2

    .line 18
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 19
    iget-object v2, p0, Lcom/bumptech/glide/Registry;->f:Le/b/a/y/z/j/g;

    .line 20
    invoke-virtual {v2, v1, p3}, Le/b/a/y/z/j/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Class;

    .line 22
    iget-object v2, p0, Lcom/bumptech/glide/Registry;->c:Le/b/a/b0/g;

    .line 23
    invoke-virtual {v2, p1, v1}, Le/b/a/b0/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v6

    .line 24
    iget-object v2, p0, Lcom/bumptech/glide/Registry;->f:Le/b/a/y/z/j/g;

    .line 25
    invoke-virtual {v2, v1, v5}, Le/b/a/y/z/j/g;->a(Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/z/j/e;

    move-result-object v7

    .line 26
    new-instance v10, Le/b/a/y/x/w;

    iget-object v8, p0, Lcom/bumptech/glide/Registry;->j:Lc/h/m/d;

    move-object v2, v10

    move-object v3, p1

    move-object v4, v1

    invoke-direct/range {v2 .. v8}, Le/b/a/y/x/w;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Le/b/a/y/z/j/e;Lc/h/m/d;)V

    .line 27
    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public a(Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            ">(TModel;)",
            "Ljava/util/List<",
            "Le/b/a/y/y/w0<",
            "TModel;*>;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->a:Le/b/a/y/y/a1;

    invoke-virtual {v0, p1}, Le/b/a/y/y/a1;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Le/b/a/y/w/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(TX;)",
            "Le/b/a/y/w/g<",
            "TX;>;"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->e:Le/b/a/y/w/j;

    invoke-virtual {v0, p1}, Le/b/a/y/w/j;->a(Ljava/lang/Object;)Le/b/a/y/w/g;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/x/v0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "TResource:",
            "Ljava/lang/Object;",
            "Transcode:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TData;>;",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Ljava/lang/Class<",
            "TTranscode;>;)",
            "Le/b/a/y/x/v0<",
            "TData;TTResource;TTranscode;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->i:Le/b/a/b0/d;

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Le/b/a/b0/d;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/x/v0;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/Registry;->i:Le/b/a/b0/d;

    invoke-virtual {v1, v0}, Le/b/a/b0/d;->a(Le/b/a/y/x/v0;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    if-nez v0, :cond_2

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v7

    .line 5
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v2

    goto :goto_0

    .line 6
    :cond_1
    new-instance v0, Le/b/a/y/x/v0;

    iget-object v8, p0, Lcom/bumptech/glide/Registry;->j:Lc/h/m/d;

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v3 .. v8}, Le/b/a/y/x/v0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lc/h/m/d;)V

    .line 7
    :goto_0
    iget-object v1, p0, Lcom/bumptech/glide/Registry;->i:Le/b/a/b0/d;

    invoke-virtual {v1, p1, p2, p3, v0}, Le/b/a/b0/d;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/x/v0;)V

    :cond_2
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

    .line 8
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->d:Le/b/a/b0/i;

    invoke-interface {p1}, Le/b/a/y/x/y0;->c()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/b/a/b0/i;->a(Ljava/lang/Class;)Le/b/a/y/u;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(Ljava/lang/Object;)Le/b/a/y/d;
    .locals 2
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

    .line 16
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->b:Le/b/a/b0/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/b/a/b0/b;->a(Ljava/lang/Class;)Le/b/a/y/d;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 17
    :cond_0
    new-instance v0, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    throw v0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "TResource:",
            "Ljava/lang/Object;",
            "Transcode:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TModel;>;",
            "Ljava/lang/Class<",
            "TTResource;>;",
            "Ljava/lang/Class<",
            "TTranscode;>;)",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/Registry;->h:Le/b/a/b0/e;

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Le/b/a/b0/e;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/bumptech/glide/Registry;->a:Le/b/a/y/y/a1;

    invoke-virtual {v1, p1}, Le/b/a/y/y/a1;->a(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    .line 5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    .line 6
    iget-object v3, p0, Lcom/bumptech/glide/Registry;->c:Le/b/a/b0/g;

    .line 7
    invoke-virtual {v3, v2, p2}, Le/b/a/b0/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 8
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    .line 9
    iget-object v4, p0, Lcom/bumptech/glide/Registry;->f:Le/b/a/y/z/j/g;

    .line 10
    invoke-virtual {v4, v3, p3}, Le/b/a/y/z/j/g;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    .line 11
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 12
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_2
    iget-object v1, p0, Lcom/bumptech/glide/Registry;->h:Le/b/a/b0/e;

    .line 14
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .line 15
    invoke-virtual {v1, p1, p2, p3, v2}, Le/b/a/b0/e;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;)V

    :cond_3
    return-object v0
.end method
