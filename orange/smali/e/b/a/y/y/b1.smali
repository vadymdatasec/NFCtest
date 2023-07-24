.class public Le/b/a/y/y/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/e;
.implements Le/b/a/y/w/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/w/e<",
        "TData;>;",
        "Le/b/a/y/w/d<",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/w/e<",
            "TData;>;>;"
        }
    .end annotation
.end field

.field public final c:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Le/b/a/n;

.field public f:Le/b/a/y/w/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/w/d<",
            "-TData;>;"
        }
    .end annotation
.end field

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Lc/h/m/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/b/a/y/w/e<",
            "TData;>;>;",
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/b/a/y/y/b1;->c:Lc/h/m/d;

    .line 3
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/util/Collection;)Ljava/util/Collection;

    .line 4
    iput-object p1, p0, Le/b/a/y/y/b1;->b:Ljava/util/List;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Le/b/a/y/y/b1;->d:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TData;>;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Le/b/a/y/y/b1;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/w/e;

    invoke-interface {v0}, Le/b/a/y/w/e;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public a(Le/b/a/n;Le/b/a/y/w/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/n;",
            "Le/b/a/y/w/d<",
            "-TData;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le/b/a/y/y/b1;->e:Le/b/a/n;

    .line 2
    iput-object p2, p0, Le/b/a/y/y/b1;->f:Le/b/a/y/w/d;

    .line 3
    iget-object p2, p0, Le/b/a/y/y/b1;->c:Lc/h/m/d;

    invoke-interface {p2}, Lc/h/m/d;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Le/b/a/y/y/b1;->g:Ljava/util/List;

    .line 4
    iget-object p2, p0, Le/b/a/y/y/b1;->b:Ljava/util/List;

    iget v0, p0, Le/b/a/y/y/b1;->d:I

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/b/a/y/w/e;

    invoke-interface {p2, p1, p0}, Le/b/a/y/w/e;->a(Le/b/a/n;Le/b/a/y/w/d;)V

    .line 5
    iget-boolean p1, p0, Le/b/a/y/y/b1;->h:Z

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0}, Le/b/a/y/y/b1;->cancel()V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1

    .line 10
    iget-object v0, p0, Le/b/a/y/y/b1;->g:Ljava/util/List;

    invoke-static {v0}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {p0}, Le/b/a/y/y/b1;->d()V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TData;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 8
    iget-object v0, p0, Le/b/a/y/y/b1;->f:Le/b/a/y/w/d;

    invoke-interface {v0, p1}, Le/b/a/y/w/d;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Le/b/a/y/y/b1;->d()V

    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/y/b1;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Le/b/a/y/y/b1;->c:Lc/h/m/d;

    invoke-interface {v1, v0}, Lc/h/m/d;->a(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/b/a/y/y/b1;->g:Ljava/util/List;

    .line 4
    iget-object v0, p0, Le/b/a/y/y/b1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/y/w/e;

    .line 5
    invoke-interface {v1}, Le/b/a/y/w/e;->b()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c()Le/b/a/y/a;
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/y/b1;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/w/e;

    invoke-interface {v0}, Le/b/a/y/w/e;->c()Le/b/a/y/a;

    move-result-object v0

    return-object v0
.end method

.method public cancel()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Le/b/a/y/y/b1;->h:Z

    .line 2
    iget-object v0, p0, Le/b/a/y/y/b1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/y/w/e;

    .line 3
    invoke-interface {v1}, Le/b/a/y/w/e;->cancel()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Le/b/a/y/y/b1;->h:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p0, Le/b/a/y/y/b1;->d:I

    iget-object v1, p0, Le/b/a/y/y/b1;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    .line 3
    iget v0, p0, Le/b/a/y/y/b1;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le/b/a/y/y/b1;->d:I

    .line 4
    iget-object v0, p0, Le/b/a/y/y/b1;->e:Le/b/a/n;

    iget-object v1, p0, Le/b/a/y/y/b1;->f:Le/b/a/y/w/d;

    invoke-virtual {p0, v0, v1}, Le/b/a/y/y/b1;->a(Le/b/a/n;Le/b/a/y/w/d;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Le/b/a/y/y/b1;->g:Ljava/util/List;

    invoke-static {v0}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Le/b/a/y/y/b1;->f:Le/b/a/y/w/d;

    new-instance v1, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Le/b/a/y/y/b1;->g:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v3, "Fetch failed"

    invoke-direct {v1, v3, v2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v1}, Le/b/a/y/w/d;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
