.class public Le/b/a/y/x/h;
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
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/n;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/y/x/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/m<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Le/b/a/y/x/k;

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
    invoke-virtual {p1}, Le/b/a/y/x/m;->c()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Le/b/a/y/x/h;-><init>(Ljava/util/List;Le/b/a/y/x/m;Le/b/a/y/x/k;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Le/b/a/y/x/m;Le/b/a/y/x/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/b/a/y/n;",
            ">;",
            "Le/b/a/y/x/m<",
            "*>;",
            "Le/b/a/y/x/k;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Le/b/a/y/x/h;->e:I

    .line 4
    iput-object p1, p0, Le/b/a/y/x/h;->b:Ljava/util/List;

    .line 5
    iput-object p2, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    .line 6
    iput-object p3, p0, Le/b/a/y/x/h;->d:Le/b/a/y/x/k;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 4

    .line 24
    iget-object v0, p0, Le/b/a/y/x/h;->d:Le/b/a/y/x/k;

    iget-object v1, p0, Le/b/a/y/x/h;->f:Le/b/a/y/n;

    iget-object v2, p0, Le/b/a/y/x/h;->i:Le/b/a/y/y/v0;

    iget-object v2, v2, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    sget-object v3, Le/b/a/y/a;->d:Le/b/a/y/a;

    invoke-interface {v0, v1, p1, v2, v3}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Exception;Le/b/a/y/w/e;Le/b/a/y/a;)V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 6

    .line 23
    iget-object v0, p0, Le/b/a/y/x/h;->d:Le/b/a/y/x/k;

    iget-object v1, p0, Le/b/a/y/x/h;->f:Le/b/a/y/n;

    iget-object v2, p0, Le/b/a/y/x/h;->i:Le/b/a/y/y/v0;

    iget-object v3, v2, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    sget-object v4, Le/b/a/y/a;->d:Le/b/a/y/a;

    iget-object v5, p0, Le/b/a/y/x/h;->f:Le/b/a/y/n;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Le/b/a/y/x/k;->a(Le/b/a/y/n;Ljava/lang/Object;Le/b/a/y/w/e;Le/b/a/y/a;Le/b/a/y/n;)V

    return-void
.end method

.method public a()Z
    .locals 7

    const-string v0, "DataCacheGenerator.startNext"

    .line 1
    invoke-static {v0}, Le/b/a/e0/u/i;->a(Ljava/lang/String;)V

    .line 2
    :cond_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/h;->g:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Le/b/a/y/x/h;->b()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/b/a/y/x/h;->i:Le/b/a/y/y/v0;

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 4
    invoke-virtual {p0}, Le/b/a/y/x/h;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    iget-object v0, p0, Le/b/a/y/x/h;->g:Ljava/util/List;

    iget v3, p0, Le/b/a/y/x/h;->h:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Le/b/a/y/x/h;->h:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/y/w0;

    .line 6
    iget-object v3, p0, Le/b/a/y/x/h;->j:Ljava/io/File;

    iget-object v4, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    .line 7
    invoke-virtual {v4}, Le/b/a/y/x/m;->n()I

    move-result v4

    iget-object v5, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    invoke-virtual {v5}, Le/b/a/y/x/m;->f()I

    move-result v5

    iget-object v6, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    invoke-virtual {v6}, Le/b/a/y/x/m;->i()Le/b/a/y/r;

    move-result-object v6

    .line 8
    invoke-interface {v0, v3, v4, v5, v6}, Le/b/a/y/y/w0;->a(Ljava/lang/Object;IILe/b/a/y/r;)Le/b/a/y/y/v0;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/h;->i:Le/b/a/y/y/v0;

    .line 9
    iget-object v0, p0, Le/b/a/y/x/h;->i:Le/b/a/y/y/v0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    iget-object v3, p0, Le/b/a/y/x/h;->i:Le/b/a/y/y/v0;

    iget-object v3, v3, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v3}, Le/b/a/y/w/e;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Le/b/a/y/x/m;->c(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    iget-object v0, p0, Le/b/a/y/x/h;->i:Le/b/a/y/y/v0;

    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    iget-object v1, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    invoke-virtual {v1}, Le/b/a/y/x/m;->j()Le/b/a/n;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Le/b/a/y/w/e;->a(Le/b/a/n;Le/b/a/y/w/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    goto :goto_1

    .line 11
    :cond_3
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return v1

    .line 12
    :cond_4
    :goto_2
    :try_start_1
    iget v0, p0, Le/b/a/y/x/h;->e:I

    add-int/2addr v0, v2

    iput v0, p0, Le/b/a/y/x/h;->e:I

    .line 13
    iget-object v2, p0, Le/b/a/y/x/h;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lt v0, v2, :cond_5

    .line 14
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    return v1

    .line 15
    :cond_5
    :try_start_2
    iget-object v0, p0, Le/b/a/y/x/h;->b:Ljava/util/List;

    iget v2, p0, Le/b/a/y/x/h;->e:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/n;

    .line 16
    new-instance v2, Le/b/a/y/x/i;

    iget-object v3, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    invoke-virtual {v3}, Le/b/a/y/x/m;->l()Le/b/a/y/n;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Le/b/a/y/x/i;-><init>(Le/b/a/y/n;Le/b/a/y/n;)V

    .line 17
    iget-object v3, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    invoke-virtual {v3}, Le/b/a/y/x/m;->d()Le/b/a/y/x/g1/c;

    move-result-object v3

    invoke-interface {v3, v2}, Le/b/a/y/x/g1/c;->a(Le/b/a/y/n;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Le/b/a/y/x/h;->j:Ljava/io/File;

    if-eqz v2, :cond_0

    .line 18
    iput-object v0, p0, Le/b/a/y/x/h;->f:Le/b/a/y/n;

    .line 19
    iget-object v0, p0, Le/b/a/y/x/h;->c:Le/b/a/y/x/m;

    invoke-virtual {v0, v2}, Le/b/a/y/x/m;->a(Ljava/io/File;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/h;->g:Ljava/util/List;

    .line 20
    iput v1, p0, Le/b/a/y/x/h;->h:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    .line 21
    invoke-static {}, Le/b/a/e0/u/i;->a()V

    .line 22
    throw v0
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget v0, p0, Le/b/a/y/x/h;->h:I

    iget-object v1, p0, Le/b/a/y/x/h;->g:Ljava/util/List;

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
    iget-object v0, p0, Le/b/a/y/x/h;->i:Le/b/a/y/y/v0;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Le/b/a/y/y/v0;->c:Le/b/a/y/w/e;

    invoke-interface {v0}, Le/b/a/y/w/e;->cancel()V

    :cond_0
    return-void
.end method
