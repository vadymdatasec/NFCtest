.class public Le/b/a/y/z/i/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/b/a/x/b;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/z/i/k;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Le/b/a/u;

.field public final e:Le/b/a/y/x/f1/g;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Le/b/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/s<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public j:Le/b/a/y/z/i/j;

.field public k:Z

.field public l:Le/b/a/y/z/i/j;

.field public m:Landroid/graphics/Bitmap;

.field public n:Le/b/a/y/z/i/j;

.field public o:Le/b/a/y/z/i/m;

.field public p:I

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(Le/b/a/d;Le/b/a/x/b;IILe/b/a/y/v;Landroid/graphics/Bitmap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/d;",
            "Le/b/a/x/b;",
            "II",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Le/b/a/d;->c()Le/b/a/y/x/f1/g;

    move-result-object v1

    .line 2
    invoke-virtual {p1}, Le/b/a/d;->e()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/b/a/d;->d(Landroid/content/Context;)Le/b/a/u;

    move-result-object v2

    .line 3
    invoke-virtual {p1}, Le/b/a/d;->e()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Le/b/a/d;->d(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    invoke-static {p1, p3, p4}, Le/b/a/y/z/i/n;->a(Le/b/a/u;II)Le/b/a/s;

    move-result-object v5

    const/4 v4, 0x0

    move-object v0, p0

    move-object v3, p2

    move-object v6, p5

    move-object v7, p6

    .line 4
    invoke-direct/range {v0 .. v7}, Le/b/a/y/z/i/n;-><init>(Le/b/a/y/x/f1/g;Le/b/a/u;Le/b/a/x/b;Landroid/os/Handler;Le/b/a/s;Le/b/a/y/v;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public constructor <init>(Le/b/a/y/x/f1/g;Le/b/a/u;Le/b/a/x/b;Landroid/os/Handler;Le/b/a/s;Le/b/a/y/v;Landroid/graphics/Bitmap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/f1/g;",
            "Le/b/a/u;",
            "Le/b/a/x/b;",
            "Landroid/os/Handler;",
            "Le/b/a/s<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    .line 7
    iput-object p2, p0, Le/b/a/y/z/i/n;->d:Le/b/a/u;

    if-nez p4, :cond_0

    .line 8
    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance v0, Le/b/a/y/z/i/l;

    invoke-direct {v0, p0}, Le/b/a/y/z/i/l;-><init>(Le/b/a/y/z/i/n;)V

    invoke-direct {p4, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 9
    :cond_0
    iput-object p1, p0, Le/b/a/y/z/i/n;->e:Le/b/a/y/x/f1/g;

    .line 10
    iput-object p4, p0, Le/b/a/y/z/i/n;->b:Landroid/os/Handler;

    .line 11
    iput-object p5, p0, Le/b/a/y/z/i/n;->i:Le/b/a/s;

    .line 12
    iput-object p3, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    .line 13
    invoke-virtual {p0, p6, p7}, Le/b/a/y/z/i/n;->a(Le/b/a/y/v;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static a(Le/b/a/u;II)Le/b/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/u;",
            "II)",
            "Le/b/a/s<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 46
    invoke-virtual {p0}, Le/b/a/u;->d()Le/b/a/s;

    move-result-object p0

    sget-object v0, Le/b/a/y/x/c0;->a:Le/b/a/y/x/c0;

    .line 47
    invoke-static {v0}, Le/b/a/c0/j;->b(Le/b/a/y/x/c0;)Le/b/a/c0/j;

    move-result-object v0

    const/4 v1, 0x1

    .line 48
    invoke-virtual {v0, v1}, Le/b/a/c0/a;->b(Z)Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    .line 49
    invoke-virtual {v0, v1}, Le/b/a/c0/a;->a(Z)Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    .line 50
    invoke-virtual {v0, p1, p2}, Le/b/a/c0/a;->a(II)Le/b/a/c0/a;

    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Le/b/a/s;->a(Le/b/a/c0/a;)Le/b/a/s;

    move-result-object p0

    return-object p0
.end method

.method public static n()Le/b/a/y/n;
    .locals 3

    .line 1
    new-instance v0, Le/b/a/d0/d;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 14
    iget-object v0, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 15
    invoke-virtual {p0}, Le/b/a/y/z/i/n;->k()V

    .line 16
    invoke-virtual {p0}, Le/b/a/y/z/i/n;->m()V

    .line 17
    iget-object v0, p0, Le/b/a/y/z/i/n;->j:Le/b/a/y/z/i/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 18
    iget-object v2, p0, Le/b/a/y/z/i/n;->d:Le/b/a/u;

    invoke-virtual {v2, v0}, Le/b/a/u;->a(Le/b/a/c0/o/h;)V

    .line 19
    iput-object v1, p0, Le/b/a/y/z/i/n;->j:Le/b/a/y/z/i/j;

    .line 20
    :cond_0
    iget-object v0, p0, Le/b/a/y/z/i/n;->l:Le/b/a/y/z/i/j;

    if-eqz v0, :cond_1

    .line 21
    iget-object v2, p0, Le/b/a/y/z/i/n;->d:Le/b/a/u;

    invoke-virtual {v2, v0}, Le/b/a/u;->a(Le/b/a/c0/o/h;)V

    .line 22
    iput-object v1, p0, Le/b/a/y/z/i/n;->l:Le/b/a/y/z/i/j;

    .line 23
    :cond_1
    iget-object v0, p0, Le/b/a/y/z/i/n;->n:Le/b/a/y/z/i/j;

    if-eqz v0, :cond_2

    .line 24
    iget-object v2, p0, Le/b/a/y/z/i/n;->d:Le/b/a/u;

    invoke-virtual {v2, v0}, Le/b/a/u;->a(Le/b/a/c0/o/h;)V

    .line 25
    iput-object v1, p0, Le/b/a/y/z/i/n;->n:Le/b/a/y/z/i/j;

    .line 26
    :cond_2
    iget-object v0, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-interface {v0}, Le/b/a/x/b;->clear()V

    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Le/b/a/y/z/i/n;->k:Z

    return-void
.end method

.method public a(Le/b/a/y/v;Landroid/graphics/Bitmap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/v<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Le/b/a/y/v;

    .line 2
    invoke-static {p2}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Le/b/a/y/z/i/n;->m:Landroid/graphics/Bitmap;

    .line 3
    iget-object v0, p0, Le/b/a/y/z/i/n;->i:Le/b/a/s;

    new-instance v1, Le/b/a/c0/j;

    invoke-direct {v1}, Le/b/a/c0/j;-><init>()V

    invoke-virtual {v1, p1}, Le/b/a/c0/a;->a(Le/b/a/y/v;)Le/b/a/c0/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/b/a/s;->a(Le/b/a/c0/a;)Le/b/a/s;

    move-result-object p1

    iput-object p1, p0, Le/b/a/y/z/i/n;->i:Le/b/a/s;

    .line 4
    invoke-static {p2}, Le/b/a/e0/t;->a(Landroid/graphics/Bitmap;)I

    move-result p1

    iput p1, p0, Le/b/a/y/z/i/n;->p:I

    .line 5
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, Le/b/a/y/z/i/n;->q:I

    .line 6
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Le/b/a/y/z/i/n;->r:I

    return-void
.end method

.method public a(Le/b/a/y/z/i/j;)V
    .locals 3

    .line 28
    iget-object v0, p0, Le/b/a/y/z/i/n;->o:Le/b/a/y/z/i/m;

    if-eqz v0, :cond_0

    .line 29
    invoke-interface {v0}, Le/b/a/y/z/i/m;->a()V

    :cond_0
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Le/b/a/y/z/i/n;->g:Z

    .line 31
    iget-boolean v0, p0, Le/b/a/y/z/i/n;->k:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    .line 32
    iget-object v0, p0, Le/b/a/y/z/i/n;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    .line 33
    :cond_1
    iget-boolean v0, p0, Le/b/a/y/z/i/n;->f:Z

    if-nez v0, :cond_3

    .line 34
    iget-boolean v0, p0, Le/b/a/y/z/i/n;->h:Z

    if-eqz v0, :cond_2

    .line 35
    iget-object v0, p0, Le/b/a/y/z/i/n;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 36
    :cond_2
    iput-object p1, p0, Le/b/a/y/z/i/n;->n:Le/b/a/y/z/i/j;

    :goto_0
    return-void

    .line 37
    :cond_3
    invoke-virtual {p1}, Le/b/a/y/z/i/j;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 38
    invoke-virtual {p0}, Le/b/a/y/z/i/n;->k()V

    .line 39
    iget-object v0, p0, Le/b/a/y/z/i/n;->j:Le/b/a/y/z/i/j;

    .line 40
    iput-object p1, p0, Le/b/a/y/z/i/n;->j:Le/b/a/y/z/i/j;

    .line 41
    iget-object p1, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    if-ltz p1, :cond_4

    .line 42
    iget-object v2, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/b/a/y/z/i/k;

    .line 43
    invoke-interface {v2}, Le/b/a/y/z/i/k;->a()V

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    .line 44
    iget-object p1, p0, Le/b/a/y/z/i/n;->b:Landroid/os/Handler;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 45
    :cond_5
    invoke-virtual {p0}, Le/b/a/y/z/i/n;->j()V

    return-void
.end method

.method public a(Le/b/a/y/z/i/k;)V
    .locals 2

    .line 7
    iget-boolean v0, p0, Le/b/a/y/z/i/n;->k:Z

    if-nez v0, :cond_2

    .line 8
    iget-object v0, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 9
    iget-object v0, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    .line 10
    iget-object v1, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p0}, Le/b/a/y/z/i/n;->l()V

    :cond_0
    return-void

    .line 12
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot subscribe twice in a row"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot subscribe to a cleared frame loader"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()Ljava/nio/ByteBuffer;
    .locals 1

    .line 4
    iget-object v0, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-interface {v0}, Le/b/a/x/b;->g()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public b(Le/b/a/y/z/i/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object p1, p0, Le/b/a/y/z/i/n;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Le/b/a/y/z/i/n;->m()V

    :cond_0
    return-void
.end method

.method public c()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/n;->j:Le/b/a/y/z/i/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/b/a/y/z/i/j;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/b/a/y/z/i/n;->m:Landroid/graphics/Bitmap;

    :goto_0
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/n;->j:Le/b/a/y/z/i/j;

    if-eqz v0, :cond_0

    iget v0, v0, Le/b/a/y/z/i/j;->f:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/n;->m:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-interface {v0}, Le/b/a/x/b;->e()I

    move-result v0

    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/y/z/i/n;->r:I

    return v0
.end method

.method public h()I
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-interface {v0}, Le/b/a/x/b;->b()I

    move-result v0

    iget v1, p0, Le/b/a/y/z/i/n;->p:I

    add-int/2addr v0, v1

    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/y/z/i/n;->q:I

    return v0
.end method

.method public final j()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Le/b/a/y/z/i/n;->f:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Le/b/a/y/z/i/n;->g:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-boolean v0, p0, Le/b/a/y/z/i/n;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Le/b/a/y/z/i/n;->n:Le/b/a/y/z/i/j;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v3, "Pending target must be null when starting from the first frame"

    invoke-static {v0, v3}, Le/b/a/e0/r;->a(ZLjava/lang/String;)V

    .line 4
    iget-object v0, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-interface {v0}, Le/b/a/x/b;->h()V

    .line 5
    iput-boolean v2, p0, Le/b/a/y/z/i/n;->h:Z

    .line 6
    :cond_2
    iget-object v0, p0, Le/b/a/y/z/i/n;->n:Le/b/a/y/z/i/j;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Le/b/a/y/z/i/n;->n:Le/b/a/y/z/i/j;

    .line 8
    invoke-virtual {p0, v0}, Le/b/a/y/z/i/n;->a(Le/b/a/y/z/i/j;)V

    return-void

    .line 9
    :cond_3
    iput-boolean v1, p0, Le/b/a/y/z/i/n;->g:Z

    .line 10
    iget-object v0, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-interface {v0}, Le/b/a/x/b;->f()I

    move-result v0

    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    .line 12
    iget-object v0, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-interface {v0}, Le/b/a/x/b;->d()V

    .line 13
    new-instance v0, Le/b/a/y/z/i/j;

    iget-object v3, p0, Le/b/a/y/z/i/n;->b:Landroid/os/Handler;

    iget-object v4, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-interface {v4}, Le/b/a/x/b;->a()I

    move-result v4

    invoke-direct {v0, v3, v4, v1, v2}, Le/b/a/y/z/i/j;-><init>(Landroid/os/Handler;IJ)V

    iput-object v0, p0, Le/b/a/y/z/i/n;->l:Le/b/a/y/z/i/j;

    .line 14
    iget-object v0, p0, Le/b/a/y/z/i/n;->i:Le/b/a/s;

    invoke-static {}, Le/b/a/y/z/i/n;->n()Le/b/a/y/n;

    move-result-object v1

    invoke-static {v1}, Le/b/a/c0/j;->b(Le/b/a/y/n;)Le/b/a/c0/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/b/a/s;->a(Le/b/a/c0/a;)Le/b/a/s;

    move-result-object v0

    iget-object v1, p0, Le/b/a/y/z/i/n;->a:Le/b/a/x/b;

    invoke-virtual {v0, v1}, Le/b/a/s;->a(Ljava/lang/Object;)Le/b/a/s;

    move-result-object v0

    iget-object v1, p0, Le/b/a/y/z/i/n;->l:Le/b/a/y/z/i/j;

    invoke-virtual {v0, v1}, Le/b/a/s;->a(Le/b/a/c0/o/h;)Le/b/a/c0/o/h;

    :cond_4
    :goto_1
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/z/i/n;->m:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Le/b/a/y/z/i/n;->e:Le/b/a/y/x/f1/g;

    invoke-interface {v1, v0}, Le/b/a/y/x/f1/g;->a(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/b/a/y/z/i/n;->m:Landroid/graphics/Bitmap;

    :cond_0
    return-void
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/y/z/i/n;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/b/a/y/z/i/n;->f:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Le/b/a/y/z/i/n;->k:Z

    .line 4
    invoke-virtual {p0}, Le/b/a/y/z/i/n;->j()V

    return-void
.end method

.method public final m()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Le/b/a/y/z/i/n;->f:Z

    return-void
.end method
