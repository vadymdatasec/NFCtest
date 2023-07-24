.class public final Le/b/a/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/v<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final b:Le/b/a/k;

.field public c:Le/b/a/y/x/j0;

.field public d:Le/b/a/y/x/f1/g;

.field public e:Le/b/a/y/x/f1/b;

.field public f:Le/b/a/y/x/g1/o;

.field public g:Le/b/a/y/x/h1/k;

.field public h:Le/b/a/y/x/h1/k;

.field public i:Le/b/a/y/x/g1/a;

.field public j:Le/b/a/y/x/g1/s;

.field public k:Le/b/a/z/e;

.field public l:I

.field public m:Le/b/a/c;

.field public n:Le/b/a/z/v$a;

.field public o:Le/b/a/y/x/h1/k;

.field public p:Z

.field public q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    iput-object v0, p0, Le/b/a/i;->a:Ljava/util/Map;

    .line 3
    new-instance v0, Le/b/a/k;

    invoke-direct {v0}, Le/b/a/k;-><init>()V

    iput-object v0, p0, Le/b/a/i;->b:Le/b/a/k;

    const/4 v0, 0x4

    .line 4
    iput v0, p0, Le/b/a/i;->l:I

    .line 5
    new-instance v0, Le/b/a/e;

    invoke-direct {v0, p0}, Le/b/a/e;-><init>(Le/b/a/i;)V

    iput-object v0, p0, Le/b/a/i;->m:Le/b/a/c;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/List;Le/b/a/a0/a;)Le/b/a/d;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Le/b/a/a0/c;",
            ">;",
            "Le/b/a/a0/a;",
            ")",
            "Le/b/a/d;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 4
    iget-object v1, v0, Le/b/a/i;->g:Le/b/a/y/x/h1/k;

    if-nez v1, :cond_0

    .line 5
    invoke-static {}, Le/b/a/y/x/h1/k;->h()Le/b/a/y/x/h1/k;

    move-result-object v1

    iput-object v1, v0, Le/b/a/i;->g:Le/b/a/y/x/h1/k;

    .line 6
    :cond_0
    iget-object v1, v0, Le/b/a/i;->h:Le/b/a/y/x/h1/k;

    if-nez v1, :cond_1

    .line 7
    invoke-static {}, Le/b/a/y/x/h1/k;->f()Le/b/a/y/x/h1/k;

    move-result-object v1

    iput-object v1, v0, Le/b/a/i;->h:Le/b/a/y/x/h1/k;

    .line 8
    :cond_1
    iget-object v1, v0, Le/b/a/i;->o:Le/b/a/y/x/h1/k;

    if-nez v1, :cond_2

    .line 9
    invoke-static {}, Le/b/a/y/x/h1/k;->d()Le/b/a/y/x/h1/k;

    move-result-object v1

    iput-object v1, v0, Le/b/a/i;->o:Le/b/a/y/x/h1/k;

    .line 10
    :cond_2
    iget-object v1, v0, Le/b/a/i;->j:Le/b/a/y/x/g1/s;

    if-nez v1, :cond_3

    .line 11
    new-instance v1, Le/b/a/y/x/g1/p;

    invoke-direct {v1, v2}, Le/b/a/y/x/g1/p;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Le/b/a/y/x/g1/p;->a()Le/b/a/y/x/g1/s;

    move-result-object v1

    iput-object v1, v0, Le/b/a/i;->j:Le/b/a/y/x/g1/s;

    .line 12
    :cond_3
    iget-object v1, v0, Le/b/a/i;->k:Le/b/a/z/e;

    if-nez v1, :cond_4

    .line 13
    new-instance v1, Le/b/a/z/g;

    invoke-direct {v1}, Le/b/a/z/g;-><init>()V

    iput-object v1, v0, Le/b/a/i;->k:Le/b/a/z/e;

    .line 14
    :cond_4
    iget-object v1, v0, Le/b/a/i;->d:Le/b/a/y/x/f1/g;

    if-nez v1, :cond_6

    .line 15
    iget-object v1, v0, Le/b/a/i;->j:Le/b/a/y/x/g1/s;

    invoke-virtual {v1}, Le/b/a/y/x/g1/s;->b()I

    move-result v1

    if-lez v1, :cond_5

    .line 16
    new-instance v3, Le/b/a/y/x/f1/r;

    int-to-long v4, v1

    invoke-direct {v3, v4, v5}, Le/b/a/y/x/f1/r;-><init>(J)V

    iput-object v3, v0, Le/b/a/i;->d:Le/b/a/y/x/f1/g;

    goto :goto_0

    .line 17
    :cond_5
    new-instance v1, Le/b/a/y/x/f1/h;

    invoke-direct {v1}, Le/b/a/y/x/f1/h;-><init>()V

    iput-object v1, v0, Le/b/a/i;->d:Le/b/a/y/x/f1/g;

    .line 18
    :cond_6
    :goto_0
    iget-object v1, v0, Le/b/a/i;->e:Le/b/a/y/x/f1/b;

    if-nez v1, :cond_7

    .line 19
    new-instance v1, Le/b/a/y/x/f1/o;

    iget-object v3, v0, Le/b/a/i;->j:Le/b/a/y/x/g1/s;

    invoke-virtual {v3}, Le/b/a/y/x/g1/s;->a()I

    move-result v3

    invoke-direct {v1, v3}, Le/b/a/y/x/f1/o;-><init>(I)V

    iput-object v1, v0, Le/b/a/i;->e:Le/b/a/y/x/f1/b;

    .line 20
    :cond_7
    iget-object v1, v0, Le/b/a/i;->f:Le/b/a/y/x/g1/o;

    if-nez v1, :cond_8

    .line 21
    new-instance v1, Le/b/a/y/x/g1/m;

    iget-object v3, v0, Le/b/a/i;->j:Le/b/a/y/x/g1/s;

    invoke-virtual {v3}, Le/b/a/y/x/g1/s;->c()I

    move-result v3

    int-to-long v3, v3

    invoke-direct {v1, v3, v4}, Le/b/a/y/x/g1/m;-><init>(J)V

    iput-object v1, v0, Le/b/a/i;->f:Le/b/a/y/x/g1/o;

    .line 22
    :cond_8
    iget-object v1, v0, Le/b/a/i;->i:Le/b/a/y/x/g1/a;

    if-nez v1, :cond_9

    .line 23
    new-instance v1, Le/b/a/y/x/g1/l;

    invoke-direct {v1, v2}, Le/b/a/y/x/g1/l;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Le/b/a/i;->i:Le/b/a/y/x/g1/a;

    .line 24
    :cond_9
    iget-object v1, v0, Le/b/a/i;->c:Le/b/a/y/x/j0;

    if-nez v1, :cond_a

    .line 25
    new-instance v1, Le/b/a/y/x/j0;

    iget-object v4, v0, Le/b/a/i;->f:Le/b/a/y/x/g1/o;

    iget-object v5, v0, Le/b/a/i;->i:Le/b/a/y/x/g1/a;

    iget-object v6, v0, Le/b/a/i;->h:Le/b/a/y/x/h1/k;

    iget-object v7, v0, Le/b/a/i;->g:Le/b/a/y/x/h1/k;

    .line 26
    invoke-static {}, Le/b/a/y/x/h1/k;->i()Le/b/a/y/x/h1/k;

    move-result-object v8

    iget-object v9, v0, Le/b/a/i;->o:Le/b/a/y/x/h1/k;

    iget-boolean v10, v0, Le/b/a/i;->p:Z

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Le/b/a/y/x/j0;-><init>(Le/b/a/y/x/g1/o;Le/b/a/y/x/g1/a;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Z)V

    iput-object v1, v0, Le/b/a/i;->c:Le/b/a/y/x/j0;

    .line 27
    :cond_a
    iget-object v1, v0, Le/b/a/i;->q:Ljava/util/List;

    if-nez v1, :cond_b

    .line 28
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Le/b/a/i;->q:Ljava/util/List;

    goto :goto_1

    .line 29
    :cond_b
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Le/b/a/i;->q:Ljava/util/List;

    .line 30
    :goto_1
    iget-object v1, v0, Le/b/a/i;->b:Le/b/a/k;

    invoke-virtual {v1}, Le/b/a/k;->a()Le/b/a/l;

    move-result-object v15

    .line 31
    new-instance v7, Le/b/a/z/v;

    iget-object v1, v0, Le/b/a/i;->n:Le/b/a/z/v$a;

    invoke-direct {v7, v1, v15}, Le/b/a/z/v;-><init>(Le/b/a/z/v$a;Le/b/a/l;)V

    .line 32
    new-instance v16, Le/b/a/d;

    iget-object v3, v0, Le/b/a/i;->c:Le/b/a/y/x/j0;

    iget-object v4, v0, Le/b/a/i;->f:Le/b/a/y/x/g1/o;

    iget-object v5, v0, Le/b/a/i;->d:Le/b/a/y/x/f1/g;

    iget-object v6, v0, Le/b/a/i;->e:Le/b/a/y/x/f1/b;

    iget-object v8, v0, Le/b/a/i;->k:Le/b/a/z/e;

    iget v9, v0, Le/b/a/i;->l:I

    iget-object v10, v0, Le/b/a/i;->m:Le/b/a/c;

    iget-object v11, v0, Le/b/a/i;->a:Ljava/util/Map;

    iget-object v12, v0, Le/b/a/i;->q:Ljava/util/List;

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    invoke-direct/range {v1 .. v15}, Le/b/a/d;-><init>(Landroid/content/Context;Le/b/a/y/x/j0;Le/b/a/y/x/g1/o;Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;Le/b/a/z/v;Le/b/a/z/e;ILe/b/a/c;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Le/b/a/a0/a;Le/b/a/l;)V

    return-object v16
.end method

.method public a(I)Le/b/a/i;
    .locals 1

    const/4 v0, 0x2

    if-lt p1, v0, :cond_0

    const/4 v0, 0x6

    if-gt p1, v0, :cond_0

    .line 1
    iput p1, p0, Le/b/a/i;->l:I

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/b/a/z/v$a;)V
    .locals 0

    .line 3
    iput-object p1, p0, Le/b/a/i;->n:Le/b/a/z/v$a;

    return-void
.end method
