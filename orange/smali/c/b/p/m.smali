.class public Lc/b/p/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/h/n/c1;",
            ">;"
        }
    .end annotation
.end field

.field public b:J

.field public c:Landroid/view/animation/Interpolator;

.field public d:Lc/h/n/d1;

.field public e:Z

.field public final f:Lc/h/n/e1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lc/b/p/m;->b:J

    .line 3
    new-instance v0, Lc/b/p/l;

    invoke-direct {v0, p0}, Lc/b/p/l;-><init>(Lc/b/p/m;)V

    iput-object v0, p0, Lc/b/p/m;->f:Lc/h/n/e1;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/b/p/m;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(J)Lc/b/p/m;
    .locals 1

    .line 10
    iget-boolean v0, p0, Lc/b/p/m;->e:Z

    if-nez v0, :cond_0

    .line 11
    iput-wide p1, p0, Lc/b/p/m;->b:J

    :cond_0
    return-object p0
.end method

.method public a(Landroid/view/animation/Interpolator;)Lc/b/p/m;
    .locals 1

    .line 12
    iget-boolean v0, p0, Lc/b/p/m;->e:Z

    if-nez v0, :cond_0

    .line 13
    iput-object p1, p0, Lc/b/p/m;->c:Landroid/view/animation/Interpolator;

    :cond_0
    return-object p0
.end method

.method public a(Lc/h/n/c1;)Lc/b/p/m;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/p/m;->e:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/p/m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public a(Lc/h/n/c1;Lc/h/n/c1;)Lc/b/p/m;
    .locals 2

    .line 3
    iget-object v0, p0, Lc/b/p/m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-virtual {p1}, Lc/h/n/c1;->b()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lc/h/n/c1;->b(J)Lc/h/n/c1;

    .line 5
    iget-object p1, p0, Lc/b/p/m;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a(Lc/h/n/d1;)Lc/b/p/m;
    .locals 1

    .line 14
    iget-boolean v0, p0, Lc/b/p/m;->e:Z

    if-nez v0, :cond_0

    .line 15
    iput-object p1, p0, Lc/b/p/m;->d:Lc/h/n/d1;

    :cond_0
    return-object p0
.end method

.method public a()V
    .locals 2

    .line 6
    iget-boolean v0, p0, Lc/b/p/m;->e:Z

    if-nez v0, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lc/b/p/m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/h/n/c1;

    .line 8
    invoke-virtual {v1}, Lc/h/n/c1;->a()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lc/b/p/m;->e:Z

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/b/p/m;->e:Z

    return-void
.end method

.method public c()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lc/b/p/m;->e:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lc/b/p/m;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/h/n/c1;

    .line 3
    iget-wide v2, p0, Lc/b/p/m;->b:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    .line 4
    invoke-virtual {v1, v2, v3}, Lc/h/n/c1;->a(J)Lc/h/n/c1;

    .line 5
    :cond_1
    iget-object v2, p0, Lc/b/p/m;->c:Landroid/view/animation/Interpolator;

    if-eqz v2, :cond_2

    .line 6
    invoke-virtual {v1, v2}, Lc/h/n/c1;->a(Landroid/view/animation/Interpolator;)Lc/h/n/c1;

    .line 7
    :cond_2
    iget-object v2, p0, Lc/b/p/m;->d:Lc/h/n/d1;

    if-eqz v2, :cond_3

    .line 8
    iget-object v2, p0, Lc/b/p/m;->f:Lc/h/n/e1;

    invoke-virtual {v1, v2}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;

    .line 9
    :cond_3
    invoke-virtual {v1}, Lc/h/n/c1;->c()V

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lc/b/p/m;->e:Z

    return-void
.end method