.class public Le/b/a/y/x/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/l;
.implements Le/b/a/y/w/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/x/l;",
        "Le/b/a/y/w/d<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Le/b/a/y/x/k;

.field public final c:Le/b/a/y/x/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/m<",
            "*>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:I

.field public f:Le/b/a/y/n;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/y/w0<",
            "Ljava/io/File;",
            "*>;>;"
        }
    .end annotation
.end field

.field public h:I

.field public volatile i:Le/b/a/y/y/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/v0<",
            "*>;"
        }
    .end annotation
.end field

.field public j:Ljava/io/File;

.field public k:Le/b/a/y/x/a1;


# direct methods
.method public constructor <init>(Le/b/a/y/x/m;Le/b/a/y/x/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/m<",
            "*>;",
            "Le/b/a/y/x/k;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Le/b/a/y/x/z0;->e:I

    .line 3
    iput-object p1, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 4
    iput-object p2, p0, Le/b/a/y/x/z0;->b:Le/b/a/y/x/k;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 4

    .line 44
    iget-object v0, p0, Le/b/a/y/x/z0;->b:Le/b/a/y/x/k;

    iget-object v1, p0, Le/b/a/y/x/z0;->k:Le/b/a/y/x/a1;

    iget-object v2, p0, Le/b/a/y/x/z0;->i:Le/b/a/y/y/v0;

    iget-object v2, v2, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    sget-object v3, Le/b/a/y/a;->e:Le/b/a/y/a;

    invoke-interface {v0, v1, p1, v2, v3}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Exception;Le/b/a/y/w/e;Le/b/a/y/a;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 6

    .line 43
    iget-object v0, p0, Le/b/a/y/x/z0;->b:Le/b/a/y/x/k;

    iget-object v1, p0, Le/b/a/y/x/z0;->f:Le/b/a/y/n;

    iget-object v2, p0, Le/b/a/y/x/z0;->i:Le/b/a/y/y/v0;

    iget-object v3, v2, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    sget-object v4, Le/b/a/y/a;->e:Le/b/a/y/a;

    iget-object v5, p0, Le/b/a/y/x/z0;->k:Le/b/a/y/x/a1;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V

    return-void
.end method

.method public a()Z
    .locals 14

    const-string v0, "ResourceCacheGenerator.startNext"

    .line 1
    invoke-static {v0}, Le/b/a/e0/u/i;->a(Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v0}, Le/b/a/y/x/m;->c()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return v2

    .line 5
    :cond_0
    :try_start_1
    iget-object v1, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v1}, Le/b/a/y/x/m;->k()Ljava/util/List;

    move-result-object v1

    .line 6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 7
    const-class v0, Ljava/io/File;

    iget-object v1, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v1}, Le/b/a/y/x/m;->m()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    .line 8
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return v2

    .line 9
    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to find any load path from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 10
    invoke-virtual {v2}, Le/b/a/y/x/m;->h()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 11
    invoke-virtual {v2}, Le/b/a/y/x/m;->m()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_2
    :goto_0
    iget-object v3, p0, Le/b/a/y/x/z0;->g:Ljava/util/List;

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Le/b/a/y/x/z0;->b()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Le/b/a/y/x/z0;->i:Le/b/a/y/y/v0;

    :cond_4
    :goto_1
    if-nez v2, :cond_5

    .line 14
    invoke-virtual {p0}, Le/b/a/y/x/z0;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 15
    iget-object v0, p0, Le/b/a/y/x/z0;->g:Ljava/util/List;

    iget v1, p0, Le/b/a/y/x/z0;->h:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Le/b/a/y/x/z0;->h:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/y/w0;

    .line 16
    iget-object v1, p0, Le/b/a/y/x/z0;->j:Ljava/io/File;

    iget-object v3, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 17
    invoke-virtual {v3}, Le/b/a/y/x/m;->n()I

    move-result v3

    iget-object v5, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v5}, Le/b/a/y/x/m;->f()I

    move-result v5

    iget-object v6, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v6}, Le/b/a/y/x/m;->i()Le/b/a/y/r;

    move-result-object v6

    .line 18
    invoke-interface {v0, v1, v3, v5, v6}, Le/b/a/y/y/w0;->a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/z0;->i:Le/b/a/y/y/v0;

    .line 19
    iget-object v0, p0, Le/b/a/y/x/z0;->i:Le/b/a/y/y/v0;

    if-eqz v0, :cond_4

    iget-object v0, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    iget-object v1, p0, Le/b/a/y/x/z0;->i:Le/b/a/y/y/v0;

    iget-object v1, v1, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v1}, Le/b/a/y/w/e;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/b/a/y/x/m;->c(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 20
    iget-object v0, p0, Le/b/a/y/x/z0;->i:Le/b/a/y/y/v0;

    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    iget-object v1, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v1}, Le/b/a/y/x/m;->j()Le/b/a/n;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Le/b/a/y/w/e;->a(Le/b/a/n;Le/b/a/y/w/d;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x1

    goto :goto_1

    .line 21
    :cond_5
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return v2

    .line 22
    :cond_6
    :goto_2
    :try_start_3
    iget v3, p0, Le/b/a/y/x/z0;->e:I

    add-int/2addr v3, v4

    iput v3, p0, Le/b/a/y/x/z0;->e:I

    .line 23
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-lt v3, v5, :cond_8

    .line 24
    iget v3, p0, Le/b/a/y/x/z0;->d:I

    add-int/2addr v3, v4

    iput v3, p0, Le/b/a/y/x/z0;->d:I

    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-lt v3, v4, :cond_7

    .line 26
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return v2

    .line 27
    :cond_7
    :try_start_4
    iput v2, p0, Le/b/a/y/x/z0;->e:I

    .line 28
    :cond_8
    iget v3, p0, Le/b/a/y/x/z0;->d:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/b/a/y/n;

    .line 29
    iget v4, p0, Le/b/a/y/x/z0;->e:I

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/Class;

    .line 30
    iget-object v4, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v4, v11}, Le/b/a/y/x/m;->b(Ljava/lang/Class;)Le/b/a/y/v;

    move-result-object v10

    .line 31
    new-instance v13, Le/b/a/y/x/a1;

    iget-object v4, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 32
    invoke-virtual {v4}, Le/b/a/y/x/m;->b()Le/b/a/y/x/f1/b;

    move-result-object v5

    iget-object v4, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 33
    invoke-virtual {v4}, Le/b/a/y/x/m;->l()Le/b/a/y/n;

    move-result-object v7

    iget-object v4, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 34
    invoke-virtual {v4}, Le/b/a/y/x/m;->n()I

    move-result v8

    iget-object v4, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 35
    invoke-virtual {v4}, Le/b/a/y/x/m;->f()I

    move-result v9

    iget-object v4, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    .line 36
    invoke-virtual {v4}, Le/b/a/y/x/m;->i()Le/b/a/y/r;

    move-result-object v12

    move-object v4, v13

    move-object v6, v3

    invoke-direct/range {v4 .. v12}, Le/b/a/y/x/a1;-><init>(Le/b/a/y/x/f1/b;Le/b/a/y/n;Le/b/a/y/n;IILe/b/a/y/v;Ljava/lang/Class;Le/b/a/y/r;)V

    iput-object v13, p0, Le/b/a/y/x/z0;->k:Le/b/a/y/x/a1;

    .line 37
    iget-object v4, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v4}, Le/b/a/y/x/m;->d()Le/b/a/y/x/g1/c;

    move-result-object v4

    iget-object v5, p0, Le/b/a/y/x/z0;->k:Le/b/a/y/x/a1;

    invoke-interface {v4, v5}, Le/b/a/y/x/g1/c;->a(Le/b/a/y/n;)Ljava/io/File;

    move-result-object v4

    iput-object v4, p0, Le/b/a/y/x/z0;->j:Ljava/io/File;

    if-eqz v4, :cond_2

    .line 38
    iput-object v3, p0, Le/b/a/y/x/z0;->f:Le/b/a/y/n;

    .line 39
    iget-object v3, p0, Le/b/a/y/x/z0;->c:Le/b/a/y/x/m;

    invoke-virtual {v3, v4}, Le/b/a/y/x/m;->a(Ljava/io/File;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Le/b/a/y/x/z0;->g:Ljava/util/List;

    .line 40
    iput v2, p0, Le/b/a/y/x/z0;->h:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    .line 41
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    .line 42
    throw v0
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget v0, p0, Le/b/a/y/x/z0;->h:I

    iget-object v1, p0, Le/b/a/y/x/z0;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/z0;->i:Le/b/a/y/y/v0;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v0}, Le/b/a/y/w/e;->cancel()V

    :cond_0
    return-void
.end method
