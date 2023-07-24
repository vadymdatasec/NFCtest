.class public abstract Lc/l/d/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static O:Z = false

.field public static P:Z = true


# instance fields
.field public A:Lc/a/k/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/k/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public B:Lc/a/k/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/k/d<",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public C:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lc/l/d/j1;",
            ">;"
        }
    .end annotation
.end field

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;"
        }
    .end annotation
.end field

.field public J:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field public L:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/l/d/n1;",
            ">;"
        }
    .end annotation
.end field

.field public M:Lc/l/d/t1;

.field public N:Ljava/lang/Runnable;

.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/l/d/l1;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public final c:Lc/l/d/c2;

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lc/l/d/t0;

.field public g:Landroidx/activity/OnBackPressedDispatcher;

.field public final h:Lc/a/g;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/l/d/k1;",
            ">;"
        }
    .end annotation
.end field

.field public m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/util/HashSet<",
            "Lc/h/j/c;",
            ">;>;"
        }
    .end annotation
.end field

.field public final n:Lc/l/d/l2;

.field public final o:Lc/l/d/v0;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lc/l/d/u1;",
            ">;"
        }
    .end annotation
.end field

.field public q:I

.field public r:Lc/l/d/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/l/d/r0<",
            "*>;"
        }
    .end annotation
.end field

.field public s:Lc/l/d/n0;

.field public t:Landroidx/fragment/app/Fragment;

.field public u:Landroidx/fragment/app/Fragment;

.field public v:Lc/l/d/q0;

.field public w:Lc/l/d/q0;

.field public x:Lc/l/d/j3;

.field public y:Lc/l/d/j3;

.field public z:Lc/a/k/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/k/d<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Lc/l/d/c2;

    invoke-direct {v0}, Lc/l/d/c2;-><init>()V

    iput-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    .line 4
    new-instance v0, Lc/l/d/t0;

    invoke-direct {v0, p0}, Lc/l/d/t0;-><init>(Lc/l/d/o1;)V

    iput-object v0, p0, Lc/l/d/o1;->f:Lc/l/d/t0;

    .line 5
    new-instance v0, Lc/l/d/y0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc/l/d/y0;-><init>(Lc/l/d/o1;Z)V

    iput-object v0, p0, Lc/l/d/o1;->h:Lc/a/g;

    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lc/l/d/o1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/o1;->j:Ljava/util/Map;

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/o1;->k:Ljava/util/Map;

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    .line 13
    new-instance v0, Lc/l/d/z0;

    invoke-direct {v0, p0}, Lc/l/d/z0;-><init>(Lc/l/d/o1;)V

    iput-object v0, p0, Lc/l/d/o1;->n:Lc/l/d/l2;

    .line 14
    new-instance v0, Lc/l/d/v0;

    invoke-direct {v0, p0}, Lc/l/d/v0;-><init>(Lc/l/d/o1;)V

    iput-object v0, p0, Lc/l/d/o1;->o:Lc/l/d/v0;

    .line 15
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lc/l/d/o1;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Lc/l/d/o1;->q:I

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lc/l/d/o1;->v:Lc/l/d/q0;

    .line 18
    new-instance v1, Lc/l/d/a1;

    invoke-direct {v1, p0}, Lc/l/d/a1;-><init>(Lc/l/d/o1;)V

    iput-object v1, p0, Lc/l/d/o1;->w:Lc/l/d/q0;

    .line 19
    iput-object v0, p0, Lc/l/d/o1;->x:Lc/l/d/j3;

    .line 20
    new-instance v0, Lc/l/d/b1;

    invoke-direct {v0, p0}, Lc/l/d/b1;-><init>(Lc/l/d/o1;)V

    iput-object v0, p0, Lc/l/d/o1;->y:Lc/l/d/j3;

    .line 21
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lc/l/d/o1;->C:Ljava/util/ArrayDeque;

    .line 22
    new-instance v0, Lc/l/d/c1;

    invoke-direct {v0, p0}, Lc/l/d/c1;-><init>(Lc/l/d/o1;)V

    iput-object v0, p0, Lc/l/d/o1;->N:Ljava/lang/Runnable;

    return-void
.end method

.method public static a(Landroid/view/View;)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 37
    sget v0, Lc/l/b;->fragment_container_view_tag:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    .line 38
    instance-of v0, p0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_0

    .line 39
    check-cast p0, Landroidx/fragment/app/Fragment;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic a(Lc/l/d/o1;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/l/d/o1;->j:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic b(Lc/l/d/o1;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/l/d/o1;->k:Ljava/util/Map;

    return-object p0
.end method

.method public static b(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    :goto_0
    if-ge p2, p3, :cond_2

    .line 35
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/l/d/a;

    .line 36
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    .line 37
    invoke-virtual {v0, v1}, Lc/l/d/a;->a(I)V

    add-int/lit8 v1, p3, -0x1

    if-ne p2, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    .line 38
    :goto_1
    invoke-virtual {v0, v2}, Lc/l/d/a;->c(Z)V

    goto :goto_2

    .line 39
    :cond_1
    invoke-virtual {v0, v2}, Lc/l/d/a;->a(I)V

    .line 40
    invoke-virtual {v0}, Lc/l/d/a;->e()V

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static synthetic c(Lc/l/d/o1;)Lc/l/d/c2;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    return-object p0
.end method

.method public static d(I)Z
    .locals 1

    .line 1
    sget-boolean v0, Lc/l/d/o1;->O:Z

    if-nez v0, :cond_1

    const-string v0, "FragmentManager"

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static e(I)I
    .locals 3

    const/16 v0, 0x2002

    const/16 v1, 0x1003

    const/16 v2, 0x1001

    if-eq p0, v2, :cond_2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x1001

    goto :goto_0

    :cond_1
    const/16 v0, 0x1003

    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method public A()Lc/l/d/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/l/d/r0<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    return-object v0
.end method

.method public B()Landroid/view/LayoutInflater$Factory2;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->f:Lc/l/d/t0;

    return-object v0
.end method

.method public C()Lc/l/d/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->o:Lc/l/d/v0;

    return-object v0
.end method

.method public D()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    return-object v0
.end method

.method public E()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->u:Landroidx/fragment/app/Fragment;

    return-object v0
.end method

.method public F()Lc/l/d/j3;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->x:Lc/l/d/j3;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->F()Lc/l/d/j3;

    move-result-object v0

    return-object v0

    .line 4
    :cond_1
    iget-object v0, p0, Lc/l/d/o1;->y:Lc/l/d/j3;

    return-object v0
.end method

.method public G()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lc/l/d/o1;->d(Z)Z

    .line 2
    iget-object v0, p0, Lc/l/d/o1;->h:Lc/a/g;

    invoke-virtual {v0}, Lc/a/g;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lc/l/d/o1;->K()Z

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->g:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->a()V

    :goto_0
    return-void
.end method

.method public H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/l/d/o1;->G:Z

    return v0
.end method

.method public I()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/l/d/o1;->E:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lc/l/d/o1;->F:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public J()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc/l/d/o1;->E:Z

    .line 3
    iput-boolean v0, p0, Lc/l/d/o1;->F:Z

    .line 4
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v1, v0}, Lc/l/d/t1;->a(Z)V

    .line 5
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->a0()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public K()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 1
    invoke-virtual {p0, v0, v1, v2}, Lc/l/d/o1;->a(Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method

.method public final L()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->l:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lc/l/d/o1;->l:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lc/l/d/o1;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/k1;

    invoke-interface {v1}, Lc/l/d/k1;->a()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public M()Landroid/os/Parcelable;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lc/l/d/o1;->u()V

    .line 2
    invoke-virtual {p0}, Lc/l/d/o1;->t()V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Lc/l/d/o1;->d(Z)Z

    .line 4
    iput-boolean v0, p0, Lc/l/d/o1;->E:Z

    .line 5
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v1, v0}, Lc/l/d/t1;->a(Z)V

    .line 6
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->h()Ljava/util/ArrayList;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const-string v2, "FragmentManager"

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 8
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "saveAllState: no fragments!"

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object v4

    .line 9
    :cond_1
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1}, Lc/l/d/c2;->i()Ljava/util/ArrayList;

    move-result-object v1

    .line 10
    iget-object v5, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    if-eqz v5, :cond_3

    .line 11
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_3

    .line 12
    new-array v4, v5, [Lc/l/d/c;

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    .line 13
    new-instance v7, Lc/l/d/c;

    iget-object v8, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc/l/d/a;

    invoke-direct {v7, v8}, Lc/l/d/c;-><init>(Lc/l/d/a;)V

    aput-object v7, v4, v6

    .line 14
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "saveAllState: adding back stack #"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    .line 16
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 17
    invoke-static {v2, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 18
    :cond_3
    new-instance v2, Lc/l/d/r1;

    invoke-direct {v2}, Lc/l/d/r1;-><init>()V

    .line 19
    iput-object v0, v2, Lc/l/d/r1;->b:Ljava/util/ArrayList;

    .line 20
    iput-object v1, v2, Lc/l/d/r1;->c:Ljava/util/ArrayList;

    .line 21
    iput-object v4, v2, Lc/l/d/r1;->d:[Lc/l/d/c;

    .line 22
    iget-object v0, p0, Lc/l/d/o1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iput v0, v2, Lc/l/d/r1;->e:I

    .line 23
    iget-object v0, p0, Lc/l/d/o1;->u:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_4

    .line 24
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    iput-object v0, v2, Lc/l/d/r1;->f:Ljava/lang/String;

    .line 25
    :cond_4
    iget-object v0, v2, Lc/l/d/r1;->g:Ljava/util/ArrayList;

    iget-object v1, p0, Lc/l/d/o1;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    iget-object v0, v2, Lc/l/d/r1;->h:Ljava/util/ArrayList;

    iget-object v1, p0, Lc/l/d/o1;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lc/l/d/o1;->C:Ljava/util/ArrayDeque;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, v2, Lc/l/d/r1;->i:Ljava/util/ArrayList;

    return-object v2
.end method

.method public N()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    .line 3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    iget-object v4, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v3, :cond_1

    const/4 v2, 0x1

    :cond_1
    if-nez v1, :cond_2

    if-eqz v2, :cond_3

    .line 5
    :cond_2
    iget-object v1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v1}, Lc/l/d/r0;->i()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lc/l/d/o1;->N:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    iget-object v1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v1}, Lc/l/d/r0;->i()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lc/l/d/o1;->N:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 7
    invoke-virtual {p0}, Lc/l/d/o1;->P()V

    .line 8
    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final O()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/a2;

    .line 2
    invoke-virtual {p0, v1}, Lc/l/d/o1;->a(Lc/l/d/a2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final P()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lc/l/d/o1;->h:Lc/a/g;

    invoke-virtual {v1, v2}, Lc/a/g;->a(Z)V

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    iget-object v0, p0, Lc/l/d/o1;->h:Lc/a/g;

    invoke-virtual {p0}, Lc/l/d/o1;->v()I

    move-result v1

    if-lez v1, :cond_1

    iget-object v1, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    .line 7
    invoke-virtual {p0, v1}, Lc/l/d/o1;->q(Landroidx/fragment/app/Fragment;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 8
    :goto_0
    invoke-virtual {v0, v2}, Lc/a/g;->a(Z)V

    return-void

    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public a()I
    .locals 1

    .line 207
    iget-object v0, p0, Lc/l/d/o1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    return v0
.end method

.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;IILc/e/d;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II",
            "Lc/e/d<",
            "Landroidx/fragment/app/Fragment;",
            ">;)I"
        }
    .end annotation

    add-int/lit8 v0, p4, -0x1

    move v1, p4

    :goto_0
    if-lt v0, p3, :cond_5

    .line 282
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/a;

    .line 283
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 284
    invoke-virtual {v2}, Lc/l/d/a;->g()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    add-int/lit8 v4, v0, 0x1

    .line 285
    invoke-virtual {v2, p1, v4, p4}, Lc/l/d/a;->a(Ljava/util/ArrayList;II)Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_4

    .line 286
    iget-object v4, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    if-nez v4, :cond_1

    .line 287
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    .line 288
    :cond_1
    new-instance v4, Lc/l/d/n1;

    invoke-direct {v4, v2, v3}, Lc/l/d/n1;-><init>(Lc/l/d/a;Z)V

    .line 289
    iget-object v6, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    invoke-virtual {v2, v4}, Lc/l/d/a;->a(Lc/l/d/z;)V

    if-eqz v3, :cond_2

    .line 291
    invoke-virtual {v2}, Lc/l/d/a;->e()V

    goto :goto_2

    .line 292
    :cond_2
    invoke-virtual {v2, v5}, Lc/l/d/a;->c(Z)V

    :goto_2
    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_3

    .line 293
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 294
    invoke-virtual {p1, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 295
    :cond_3
    invoke-virtual {p0, p5}, Lc/l/d/o1;->a(Lc/e/d;)V

    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_5
    return v1
.end method

.method public a(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 4

    .line 34
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 35
    :cond_0
    invoke-virtual {p0, p1}, Lc/l/d/o1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    .line 36
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Fragment no longer exists for key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": unique id "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lc/l/d/o1;->a(Ljava/lang/RuntimeException;)V

    throw v0
.end method

.method public a(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;
    .locals 3

    const/4 v0, 0x2

    .line 184
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "add: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    :cond_0
    invoke-virtual {p0, p1}, Lc/l/d/o1;->e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;

    move-result-object v0

    .line 186
    iput-object p0, p1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    .line 187
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1, v0}, Lc/l/d/c2;->a(Lc/l/d/a2;)V

    .line 188
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->B:Z

    if-nez v1, :cond_2

    .line 189
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1, p1}, Lc/l/d/c2;->a(Landroidx/fragment/app/Fragment;)V

    const/4 v1, 0x0

    .line 190
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->n:Z

    .line 191
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-nez v2, :cond_1

    .line 192
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->N:Z

    .line 193
    :cond_1
    invoke-virtual {p0, p1}, Lc/l/d/o1;->o(Landroidx/fragment/app/Fragment;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    .line 194
    iput-boolean p1, p0, Lc/l/d/o1;->D:Z

    :cond_2
    return-object v0
.end method

.method public final a(Ljava/util/ArrayList;II)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;II)",
            "Ljava/util/Set<",
            "Lc/l/d/i3;",
            ">;"
        }
    .end annotation

    .line 276
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    :goto_0
    if-ge p2, p3, :cond_2

    .line 277
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/a;

    .line 278
    iget-object v1, v1, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/d2;

    .line 279
    iget-object v2, v2, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_0

    .line 280
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    .line 281
    invoke-static {v2, p0}, Lc/l/d/i3;->a(Landroid/view/ViewGroup;Lc/l/d/o1;)Lc/l/d/i3;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final a(I)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 418
    :try_start_0
    iput-boolean v0, p0, Lc/l/d/o1;->b:Z

    .line 419
    iget-object v2, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v2, p1}, Lc/l/d/c2;->a(I)V

    .line 420
    invoke-virtual {p0, p1, v1}, Lc/l/d/o1;->a(IZ)V

    .line 421
    sget-boolean p1, Lc/l/d/o1;->P:Z

    if-eqz p1, :cond_0

    .line 422
    invoke-virtual {p0}, Lc/l/d/o1;->f()Ljava/util/Set;

    move-result-object p1

    .line 423
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/i3;

    .line 424
    invoke-virtual {v2}, Lc/l/d/i3;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 425
    :cond_0
    iput-boolean v1, p0, Lc/l/d/o1;->b:Z

    .line 426
    invoke-virtual {p0, v0}, Lc/l/d/o1;->d(Z)Z

    return-void

    :catchall_0
    move-exception p1

    .line 427
    iput-boolean v1, p0, Lc/l/d/o1;->b:Z

    .line 428
    throw p1
.end method

.method public a(II)V
    .locals 2

    if-ltz p1, :cond_0

    .line 12
    new-instance v0, Lc/l/d/m1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1, p2}, Lc/l/d/m1;-><init>(Lc/l/d/o1;Ljava/lang/String;II)V

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Lc/l/d/o1;->a(Lc/l/d/l1;Z)V

    return-void

    .line 13
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bad id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a(IZ)V
    .locals 3

    .line 166
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 167
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 168
    iget p2, p0, Lc/l/d/o1;->q:I

    if-ne p1, p2, :cond_2

    return-void

    .line 169
    :cond_2
    iput p1, p0, Lc/l/d/o1;->q:I

    .line 170
    sget-boolean p1, Lc/l/d/o1;->P:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    .line 171
    iget-object p1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {p1}, Lc/l/d/c2;->f()V

    goto :goto_4

    .line 172
    :cond_3
    iget-object p1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {p1}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 173
    invoke-virtual {p0, v0}, Lc/l/d/o1;->r(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    .line 174
    :cond_4
    iget-object p1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {p1}, Lc/l/d/c2;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/l/d/a2;

    .line 175
    invoke-virtual {v0}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 176
    iget-boolean v2, v1, Landroidx/fragment/app/Fragment;->M:Z

    if-nez v2, :cond_6

    .line 177
    invoke-virtual {p0, v1}, Lc/l/d/o1;->r(Landroidx/fragment/app/Fragment;)V

    .line 178
    :cond_6
    iget-boolean v2, v1, Landroidx/fragment/app/Fragment;->n:Z

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->T()Z

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, 0x1

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_5

    .line 179
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1, v0}, Lc/l/d/c2;->b(Lc/l/d/a2;)V

    goto :goto_2

    .line 180
    :cond_8
    :goto_4
    invoke-virtual {p0}, Lc/l/d/o1;->O()V

    .line 181
    iget-boolean p1, p0, Lc/l/d/o1;->D:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-eqz p1, :cond_9

    iget v0, p0, Lc/l/d/o1;->q:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_9

    .line 182
    invoke-virtual {p1}, Lc/l/d/r0;->l()V

    .line 183
    iput-boolean p2, p0, Lc/l/d/o1;->D:Z

    :cond_9
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 2

    .line 431
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_0

    .line 432
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->a(Landroid/content/res/Configuration;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Landroid/os/Bundle;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 31
    iget-object v0, p3, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    if-ne v0, p0, :cond_0

    .line 32
    iget-object p3, p3, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Fragment "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " is not currently in the FragmentManager"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lc/l/d/o1;->a(Ljava/lang/RuntimeException;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public a(Landroid/os/Parcelable;)V
    .locals 11

    if-nez p1, :cond_0

    return-void

    .line 337
    :cond_0
    check-cast p1, Lc/l/d/r1;

    .line 338
    iget-object v0, p1, Lc/l/d/r1;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    return-void

    .line 339
    :cond_1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->g()V

    .line 340
    iget-object v0, p1, Lc/l/d/r1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "): "

    const/4 v3, 0x2

    const-string v4, "FragmentManager"

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lc/l/d/x1;

    if-eqz v10, :cond_2

    .line 341
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    iget-object v5, v10, Lc/l/d/x1;->c:Ljava/lang/String;

    invoke-virtual {v1, v5}, Lc/l/d/t1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 342
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 343
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "restoreSaveState: re-attaching retained "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    :cond_3
    new-instance v5, Lc/l/d/a2;

    iget-object v6, p0, Lc/l/d/o1;->o:Lc/l/d/v0;

    iget-object v7, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-direct {v5, v6, v7, v1, v10}, Lc/l/d/a2;-><init>(Lc/l/d/v0;Lc/l/d/c2;Landroidx/fragment/app/Fragment;Lc/l/d/x1;)V

    goto :goto_1

    .line 345
    :cond_4
    new-instance v1, Lc/l/d/a2;

    iget-object v6, p0, Lc/l/d/o1;->o:Lc/l/d/v0;

    iget-object v7, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    iget-object v5, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    .line 346
    invoke-virtual {v5}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v8

    .line 347
    invoke-virtual {p0}, Lc/l/d/o1;->x()Lc/l/d/q0;

    move-result-object v9

    move-object v5, v1

    invoke-direct/range {v5 .. v10}, Lc/l/d/a2;-><init>(Lc/l/d/v0;Lc/l/d/c2;Ljava/lang/ClassLoader;Lc/l/d/q0;Lc/l/d/x1;)V

    .line 348
    :goto_1
    invoke-virtual {v5}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 349
    iput-object p0, v1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    .line 350
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 351
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "restoreSaveState: active ("

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 352
    :cond_5
    iget-object v1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v1}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v5, v1}, Lc/l/d/a2;->a(Ljava/lang/ClassLoader;)V

    .line 353
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1, v5}, Lc/l/d/c2;->a(Lc/l/d/a2;)V

    .line 354
    iget v1, p0, Lc/l/d/o1;->q:I

    invoke-virtual {v5, v1}, Lc/l/d/a2;->a(I)V

    goto/16 :goto_0

    .line 355
    :cond_6
    iget-object v0, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v0}, Lc/l/d/t1;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 356
    iget-object v5, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    iget-object v6, v1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lc/l/d/c2;->a(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 357
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 358
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Discarding retained Fragment "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " that was not found in the set of active Fragments "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p1, Lc/l/d/r1;->b:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 359
    :cond_8
    iget-object v5, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v5, v1}, Lc/l/d/t1;->e(Landroidx/fragment/app/Fragment;)V

    .line 360
    iput-object p0, v1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    .line 361
    new-instance v5, Lc/l/d/a2;

    iget-object v6, p0, Lc/l/d/o1;->o:Lc/l/d/v0;

    iget-object v7, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-direct {v5, v6, v7, v1}, Lc/l/d/a2;-><init>(Lc/l/d/v0;Lc/l/d/c2;Landroidx/fragment/app/Fragment;)V

    const/4 v6, 0x1

    .line 362
    invoke-virtual {v5, v6}, Lc/l/d/a2;->a(I)V

    .line 363
    invoke-virtual {v5}, Lc/l/d/a2;->l()V

    .line 364
    iput-boolean v6, v1, Landroidx/fragment/app/Fragment;->n:Z

    .line 365
    invoke-virtual {v5}, Lc/l/d/a2;->l()V

    goto :goto_2

    .line 366
    :cond_9
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    iget-object v1, p1, Lc/l/d/r1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lc/l/d/c2;->a(Ljava/util/List;)V

    .line 367
    iget-object v0, p1, Lc/l/d/r1;->d:[Lc/l/d/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    .line 368
    new-instance v0, Ljava/util/ArrayList;

    iget-object v5, p1, Lc/l/d/r1;->d:[Lc/l/d/c;

    array-length v5, v5

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 369
    :goto_3
    iget-object v5, p1, Lc/l/d/r1;->d:[Lc/l/d/c;

    array-length v6, v5

    if-ge v0, v6, :cond_c

    .line 370
    aget-object v5, v5, v0

    invoke-virtual {v5, p0}, Lc/l/d/c;->a(Lc/l/d/o1;)Lc/l/d/a;

    move-result-object v5

    .line 371
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 372
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "restoreAllState: back stack #"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " (index "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, v5, Lc/l/d/a;->s:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    new-instance v6, Lc/l/d/z2;

    invoke-direct {v6, v4}, Lc/l/d/z2;-><init>(Ljava/lang/String;)V

    .line 374
    new-instance v7, Ljava/io/PrintWriter;

    invoke-direct {v7, v6}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v6, "  "

    .line 375
    invoke-virtual {v5, v6, v7, v1}, Lc/l/d/a;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 376
    invoke-virtual {v7}, Ljava/io/PrintWriter;->close()V

    .line 377
    :cond_a
    iget-object v6, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_b
    const/4 v0, 0x0

    .line 378
    iput-object v0, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    .line 379
    :cond_c
    iget-object v0, p0, Lc/l/d/o1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v2, p1, Lc/l/d/r1;->e:I

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 380
    iget-object v0, p1, Lc/l/d/r1;->f:Ljava/lang/String;

    if-eqz v0, :cond_d

    .line 381
    invoke-virtual {p0, v0}, Lc/l/d/o1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/o1;->u:Landroidx/fragment/app/Fragment;

    .line 382
    invoke-virtual {p0, v0}, Lc/l/d/o1;->i(Landroidx/fragment/app/Fragment;)V

    .line 383
    :cond_d
    iget-object v0, p1, Lc/l/d/r1;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_e

    .line 384
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_e

    .line 385
    iget-object v2, p1, Lc/l/d/r1;->h:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    .line 386
    iget-object v3, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v3}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 387
    iget-object v3, p0, Lc/l/d/o1;->j:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 388
    :cond_e
    new-instance v0, Ljava/util/ArrayDeque;

    iget-object p1, p1, Lc/l/d/r1;->i:Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lc/l/d/o1;->C:Ljava/util/ArrayDeque;

    return-void
.end method

.method public a(Landroid/view/Menu;)V
    .locals 2

    .line 447
    iget v0, p0, Lc/l/d/o1;->q:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    .line 448
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_1

    .line 449
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->c(Landroid/view/Menu;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Landroidx/fragment/app/Fragment;I)V
    .locals 10

    .line 113
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    iget-object v1, p1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc/l/d/c2;->e(Ljava/lang/String;)Lc/l/d/a2;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 114
    new-instance v0, Lc/l/d/a2;

    iget-object v2, p0, Lc/l/d/o1;->o:Lc/l/d/v0;

    iget-object v3, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-direct {v0, v2, v3, p1}, Lc/l/d/a2;-><init>(Lc/l/d/v0;Lc/l/d/c2;Landroidx/fragment/app/Fragment;)V

    .line 115
    invoke-virtual {v0, v1}, Lc/l/d/a2;->a(I)V

    .line 116
    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->o:Z

    const/4 v3, 0x2

    if-eqz v2, :cond_1

    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->p:Z

    if-eqz v2, :cond_1

    iget v2, p1, Landroidx/fragment/app/Fragment;->b:I

    if-ne v2, v3, :cond_1

    .line 117
    invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 118
    :cond_1
    invoke-virtual {v0}, Lc/l/d/a2;->d()I

    move-result v2

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 119
    iget v2, p1, Landroidx/fragment/app/Fragment;->b:I

    const/4 v4, 0x3

    const-string v5, "FragmentManager"

    const/4 v6, -0x1

    const/4 v7, 0x5

    const/4 v8, 0x4

    if-gt v2, p2, :cond_a

    if-ge v2, p2, :cond_2

    .line 120
    iget-object v2, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 121
    invoke-virtual {p0, p1}, Lc/l/d/o1;->c(Landroidx/fragment/app/Fragment;)V

    .line 122
    :cond_2
    iget v2, p1, Landroidx/fragment/app/Fragment;->b:I

    if-eq v2, v6, :cond_3

    if-eqz v2, :cond_4

    if-eq v2, v1, :cond_5

    if-eq v2, v3, :cond_7

    if-eq v2, v8, :cond_8

    if-eq v2, v7, :cond_9

    goto/16 :goto_1

    :cond_3
    if-le p2, v6, :cond_4

    .line 123
    invoke-virtual {v0}, Lc/l/d/a2;->c()V

    :cond_4
    if-lez p2, :cond_5

    .line 124
    invoke-virtual {v0}, Lc/l/d/a2;->e()V

    :cond_5
    if-le p2, v6, :cond_6

    .line 125
    invoke-virtual {v0}, Lc/l/d/a2;->j()V

    :cond_6
    if-le p2, v1, :cond_7

    .line 126
    invoke-virtual {v0}, Lc/l/d/a2;->f()V

    :cond_7
    if-le p2, v3, :cond_8

    .line 127
    invoke-virtual {v0}, Lc/l/d/a2;->a()V

    :cond_8
    if-le p2, v8, :cond_9

    .line 128
    invoke-virtual {v0}, Lc/l/d/a2;->s()V

    :cond_9
    if-le p2, v7, :cond_18

    .line 129
    invoke-virtual {v0}, Lc/l/d/a2;->n()V

    goto/16 :goto_1

    :cond_a
    if-le v2, p2, :cond_18

    if-eqz v2, :cond_16

    if-eq v2, v1, :cond_14

    if-eq v2, v3, :cond_f

    if-eq v2, v8, :cond_d

    if-eq v2, v7, :cond_c

    const/4 v9, 0x7

    if-eq v2, v9, :cond_b

    goto/16 :goto_1

    :cond_b
    if-ge p2, v9, :cond_c

    .line 130
    invoke-virtual {v0}, Lc/l/d/a2;->m()V

    :cond_c
    if-ge p2, v7, :cond_d

    .line 131
    invoke-virtual {v0}, Lc/l/d/a2;->t()V

    :cond_d
    if-ge p2, v8, :cond_f

    .line 132
    invoke-static {v4}, Lc/l/d/o1;->d(I)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 133
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "movefrom ACTIVITY_CREATED: "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    :cond_e
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v2, :cond_f

    .line 135
    iget-object v2, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v2, p1}, Lc/l/d/r0;->a(Landroidx/fragment/app/Fragment;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, p1, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    if-nez v2, :cond_f

    .line 136
    invoke-virtual {v0}, Lc/l/d/a2;->r()V

    :cond_f
    if-ge p2, v3, :cond_14

    const/4 v2, 0x0

    .line 137
    iget-object v7, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v7, :cond_13

    iget-object v8, p1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v8, :cond_13

    .line 138
    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 139
    iget-object v7, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->clearAnimation()V

    .line 140
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->X()Z

    move-result v7

    if-nez v7, :cond_13

    .line 141
    iget v7, p0, Lc/l/d/o1;->q:I

    const/4 v8, 0x0

    if-le v7, v6, :cond_10

    iget-boolean v6, p0, Lc/l/d/o1;->G:Z

    if-nez v6, :cond_10

    iget-object v6, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 142
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_10

    iget v6, p1, Landroidx/fragment/app/Fragment;->O:F

    cmpl-float v6, v6, v8

    if-ltz v6, :cond_10

    .line 143
    iget-object v2, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v2}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v2

    const/4 v6, 0x0

    .line 144
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->A()Z

    move-result v7

    .line 145
    invoke-static {v2, p1, v6, v7}, Lc/l/d/m0;->a(Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Lc/l/d/k0;

    move-result-object v2

    .line 146
    :cond_10
    iput v8, p1, Landroidx/fragment/app/Fragment;->O:F

    .line 147
    iget-object v6, p1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    .line 148
    iget-object v7, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v2, :cond_11

    .line 149
    iget-object v8, p0, Lc/l/d/o1;->n:Lc/l/d/l2;

    invoke-static {p1, v2, v8}, Lc/l/d/m0;->a(Landroidx/fragment/app/Fragment;Lc/l/d/k0;Lc/l/d/l2;)V

    .line 150
    :cond_11
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 151
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Removing view "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " from container "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    :cond_12
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eq v6, v2, :cond_13

    return-void

    .line 154
    :cond_13
    iget-object v2, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_14

    .line 155
    invoke-virtual {v0}, Lc/l/d/a2;->h()V

    :cond_14
    if-ge p2, v1, :cond_16

    .line 156
    iget-object v2, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_15

    goto :goto_0

    .line 157
    :cond_15
    invoke-virtual {v0}, Lc/l/d/a2;->g()V

    :cond_16
    move v1, p2

    :goto_0
    if-gez v1, :cond_17

    .line 158
    invoke-virtual {v0}, Lc/l/d/a2;->i()V

    :cond_17
    move p2, v1

    .line 159
    :cond_18
    :goto_1
    iget v0, p1, Landroidx/fragment/app/Fragment;->b:I

    if-eq v0, p2, :cond_1a

    .line 160
    invoke-static {v4}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveToState: Fragment state for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " not updated inline; expected state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Landroidx/fragment/app/Fragment;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    :cond_19
    iput p2, p1, Landroidx/fragment/app/Fragment;->b:I

    :cond_1a
    return-void
.end method

.method public a(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V
    .locals 2

    .line 27
    iget-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 28
    iget-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashSet;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)V
    .locals 2

    .line 450
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lc/l/d/o1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->u:Lc/l/d/r0;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    if-ne v0, p0, :cond_1

    .line 451
    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/Fragment;->R:Lc/n/g$b;

    return-void

    .line 452
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a(Landroidx/fragment/app/Fragment;Z)V
    .locals 1

    .line 163
    invoke-virtual {p0, p1}, Lc/l/d/o1;->k(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 164
    instance-of v0, p1, Lc/l/d/o0;

    if-eqz v0, :cond_0

    .line 165
    check-cast p1, Lc/l/d/o0;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Lc/l/d/o0;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method public final a(Lc/e/d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/e/d<",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    .line 313
    iget v0, p0, Lc/l/d/o1;->q:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x5

    .line 314
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 315
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 316
    iget v3, v2, Landroidx/fragment/app/Fragment;->b:I

    if-ge v3, v0, :cond_1

    .line 317
    invoke-virtual {p0, v2, v0}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;I)V

    .line 318
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v3, :cond_1

    iget-boolean v3, v2, Landroidx/fragment/app/Fragment;->A:Z

    if-nez v3, :cond_1

    iget-boolean v3, v2, Landroidx/fragment/app/Fragment;->M:Z

    if-eqz v3, :cond_1

    .line 319
    invoke-virtual {p1, v2}, Lc/e/d;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Lc/l/d/a2;)V
    .locals 2

    .line 105
    invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 106
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->J:Z

    if-eqz v1, :cond_2

    .line 107
    iget-boolean v1, p0, Lc/l/d/o1;->b:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    .line 108
    iput-boolean p1, p0, Lc/l/d/o1;->H:Z

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 109
    iput-boolean v1, v0, Landroidx/fragment/app/Fragment;->J:Z

    .line 110
    sget-boolean v1, Lc/l/d/o1;->P:Z

    if-eqz v1, :cond_1

    .line 111
    invoke-virtual {p1}, Lc/l/d/a2;->l()V

    goto :goto_0

    .line 112
    :cond_1
    invoke-virtual {p0, v0}, Lc/l/d/o1;->s(Landroidx/fragment/app/Fragment;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Lc/l/d/a;)V
    .locals 1

    .line 320
    iget-object v0, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 321
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    .line 322
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lc/l/d/a;ZZZ)V
    .locals 9

    if-eqz p2, :cond_0

    .line 296
    invoke-virtual {p1, p4}, Lc/l/d/a;->c(Z)V

    goto :goto_0

    .line 297
    :cond_0
    invoke-virtual {p1}, Lc/l/d/a;->e()V

    .line 298
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    const/4 v8, 0x1

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 299
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 300
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    .line 302
    iget p2, p0, Lc/l/d/o1;->q:I

    if-lt p2, v8, :cond_1

    .line 303
    iget-object p2, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {p2}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lc/l/d/o1;->s:Lc/l/d/n0;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    iget-object v7, p0, Lc/l/d/o1;->n:Lc/l/d/l2;

    invoke-static/range {v0 .. v7}, Lc/l/d/n2;->a(Landroid/content/Context;Lc/l/d/n0;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZLc/l/d/l2;)V

    :cond_1
    if-eqz p4, :cond_2

    .line 304
    iget p2, p0, Lc/l/d/o1;->q:I

    invoke-virtual {p0, p2, v8}, Lc/l/d/o1;->a(IZ)V

    .line 305
    :cond_2
    iget-object p2, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {p2}, Lc/l/d/c2;->c()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/fragment/app/Fragment;

    if-eqz p3, :cond_3

    .line 306
    iget-object v0, p3, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-boolean v0, p3, Landroidx/fragment/app/Fragment;->M:Z

    if-eqz v0, :cond_3

    iget v0, p3, Landroidx/fragment/app/Fragment;->y:I

    .line 307
    invoke-virtual {p1, v0}, Lc/l/d/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 308
    iget v0, p3, Landroidx/fragment/app/Fragment;->O:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_4

    .line 309
    iget-object v2, p3, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_4
    if-eqz p4, :cond_5

    .line 310
    iput v1, p3, Landroidx/fragment/app/Fragment;->O:F

    goto :goto_1

    :cond_5
    const/high16 v0, -0x40800000    # -1.0f

    .line 311
    iput v0, p3, Landroidx/fragment/app/Fragment;->O:F

    const/4 v0, 0x0

    .line 312
    iput-boolean v0, p3, Landroidx/fragment/app/Fragment;->M:Z

    goto :goto_1

    :cond_6
    return-void
.end method

.method public a(Lc/l/d/l1;Z)V
    .locals 2

    if-nez p2, :cond_2

    .line 195
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-nez v0, :cond_1

    .line 196
    iget-boolean p1, p0, Lc/l/d/o1;->G:Z

    if-eqz p1, :cond_0

    .line 197
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 198
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 199
    :cond_1
    invoke-virtual {p0}, Lc/l/d/o1;->d()V

    .line 200
    :cond_2
    iget-object v0, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    monitor-enter v0

    .line 201
    :try_start_0
    iget-object v1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-nez v1, :cond_4

    if-eqz p2, :cond_3

    .line 202
    monitor-exit v0

    return-void

    .line 203
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 204
    :cond_4
    iget-object p2, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    invoke-virtual {p0}, Lc/l/d/o1;->N()V

    .line 206
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lc/l/d/o0;)V
    .locals 5

    .line 40
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/a2;

    .line 41
    invoke-virtual {v1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v2

    .line 42
    iget v3, v2, Landroidx/fragment/app/Fragment;->y:I

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getId()I

    move-result v4

    if-ne v3, v4, :cond_0

    iget-object v3, v2, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v3, :cond_0

    .line 43
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_0

    .line 44
    iput-object p1, v2, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    .line 45
    invoke-virtual {v1}, Lc/l/d/a2;->b()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Lc/l/d/r0;Lc/l/d/n0;Landroidx/fragment/app/Fragment;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/r0<",
            "*>;",
            "Lc/l/d/n0;",
            "Landroidx/fragment/app/Fragment;",
            ")V"
        }
    .end annotation

    .line 389
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-nez v0, :cond_9

    .line 390
    iput-object p1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    .line 391
    iput-object p2, p0, Lc/l/d/o1;->s:Lc/l/d/n0;

    .line 392
    iput-object p3, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    if-eqz p3, :cond_0

    .line 393
    new-instance p2, Lc/l/d/e1;

    invoke-direct {p2, p0, p3}, Lc/l/d/e1;-><init>(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, p2}, Lc/l/d/o1;->a(Lc/l/d/u1;)V

    goto :goto_0

    .line 394
    :cond_0
    instance-of p2, p1, Lc/l/d/u1;

    if-eqz p2, :cond_1

    .line 395
    move-object p2, p1

    check-cast p2, Lc/l/d/u1;

    invoke-virtual {p0, p2}, Lc/l/d/o1;->a(Lc/l/d/u1;)V

    .line 396
    :cond_1
    :goto_0
    iget-object p2, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_2

    .line 397
    invoke-virtual {p0}, Lc/l/d/o1;->P()V

    .line 398
    :cond_2
    instance-of p2, p1, Lc/a/i;

    if-eqz p2, :cond_4

    .line 399
    move-object p2, p1

    check-cast p2, Lc/a/i;

    .line 400
    invoke-interface {p2}, Lc/a/i;->b()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/o1;->g:Landroidx/activity/OnBackPressedDispatcher;

    if-eqz p3, :cond_3

    move-object p2, p3

    .line 401
    :cond_3
    iget-object v0, p0, Lc/l/d/o1;->g:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v1, p0, Lc/l/d/o1;->h:Lc/a/g;

    invoke-virtual {v0, p2, v1}, Landroidx/activity/OnBackPressedDispatcher;->a(Lc/n/j;Lc/a/g;)V

    :cond_4
    if-eqz p3, :cond_5

    .line 402
    iget-object p1, p3, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    invoke-virtual {p1, p3}, Lc/l/d/o1;->j(Landroidx/fragment/app/Fragment;)Lc/l/d/t1;

    move-result-object p1

    iput-object p1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    goto :goto_1

    .line 403
    :cond_5
    instance-of p2, p1, Lc/n/y;

    if-eqz p2, :cond_6

    .line 404
    check-cast p1, Lc/n/y;

    invoke-interface {p1}, Lc/n/y;->f()Lc/n/x;

    move-result-object p1

    .line 405
    invoke-static {p1}, Lc/l/d/t1;->a(Lc/n/x;)Lc/l/d/t1;

    move-result-object p1

    iput-object p1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    goto :goto_1

    .line 406
    :cond_6
    new-instance p1, Lc/l/d/t1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lc/l/d/t1;-><init>(Z)V

    iput-object p1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    .line 407
    :goto_1
    iget-object p1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {p0}, Lc/l/d/o1;->I()Z

    move-result p2

    invoke-virtual {p1, p2}, Lc/l/d/t1;->a(Z)V

    .line 408
    iget-object p1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    iget-object p2, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {p1, p2}, Lc/l/d/c2;->a(Lc/l/d/t1;)V

    .line 409
    iget-object p1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    instance-of p2, p1, Lc/a/k/h;

    if-eqz p2, :cond_8

    .line 410
    check-cast p1, Lc/a/k/h;

    .line 411
    invoke-interface {p1}, Lc/a/k/h;->d()Lc/a/k/f;

    move-result-object p1

    if-eqz p3, :cond_7

    .line 412
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p3, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ":"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_7
    const-string p2, ""

    .line 413
    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "FragmentManager:"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 414
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "StartActivityForResult"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Lc/a/k/i/c;

    invoke-direct {v0}, Lc/a/k/i/c;-><init>()V

    new-instance v1, Lc/l/d/f1;

    invoke-direct {v1, p0}, Lc/l/d/f1;-><init>(Lc/l/d/o1;)V

    invoke-virtual {p1, p3, v0, v1}, Lc/a/k/f;->a(Ljava/lang/String;Lc/a/k/i/a;Lc/a/k/c;)Lc/a/k/d;

    move-result-object p3

    iput-object p3, p0, Lc/l/d/o1;->z:Lc/a/k/d;

    .line 415
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "StartIntentSenderForResult"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Lc/l/d/g1;

    invoke-direct {v0}, Lc/l/d/g1;-><init>()V

    new-instance v1, Lc/l/d/w0;

    invoke-direct {v1, p0}, Lc/l/d/w0;-><init>(Lc/l/d/o1;)V

    invoke-virtual {p1, p3, v0, v1}, Lc/a/k/f;->a(Ljava/lang/String;Lc/a/k/i/a;Lc/a/k/c;)Lc/a/k/d;

    move-result-object p3

    iput-object p3, p0, Lc/l/d/o1;->A:Lc/a/k/d;

    .line 416
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "RequestPermissions"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Lc/a/k/i/b;

    invoke-direct {p3}, Lc/a/k/i/b;-><init>()V

    new-instance v0, Lc/l/d/x0;

    invoke-direct {v0, p0}, Lc/l/d/x0;-><init>(Lc/l/d/o1;)V

    invoke-virtual {p1, p2, p3, v0}, Lc/a/k/f;->a(Ljava/lang/String;Lc/a/k/i/a;Lc/a/k/c;)Lc/a/k/d;

    move-result-object p1

    iput-object p1, p0, Lc/l/d/o1;->B:Lc/a/k/d;

    :cond_8
    return-void

    .line 417
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lc/l/d/u1;)V
    .locals 1

    .line 453
    iget-object v0, p0, Lc/l/d/o1;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Ljava/lang/RuntimeException;)V
    .locals 7

    .line 2
    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Activity state:"

    .line 3
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    new-instance v0, Lc/l/d/z2;

    invoke-direct {v0, v1}, Lc/l/d/z2;-><init>(Ljava/lang/String;)V

    .line 5
    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 6
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    const-string v3, "Failed dumping state"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "  "

    if-eqz v0, :cond_0

    :try_start_0
    new-array v4, v4, [Ljava/lang/String;

    .line 7
    invoke-virtual {v0, v6, v5, v2, v4}, Lc/l/d/r0;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 9
    invoke-virtual {p0, v6, v5, v2, v0}, Lc/l/d/o1;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 10
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    :goto_0
    throw p1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 30
    iget-object v0, p0, Lc/l/d/o1;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 47
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1, p1, p2, p3, p4}, Lc/l/d/c2;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 48
    iget-object p2, p0, Lc/l/d/o1;->e:Ljava/util/ArrayList;

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    .line 49
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_0

    .line 50
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Fragments Created Menus:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 51
    iget-object v2, p0, Lc/l/d/o1;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 52
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    .line 53
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    .line 55
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 57
    :cond_0
    iget-object p2, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    .line 58
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1

    .line 59
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Back Stack:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p2, :cond_1

    .line 60
    iget-object v2, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/a;

    .line 61
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    .line 62
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    .line 64
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v2}, Lc/l/d/a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v2, v0, p3}, Lc/l/d/a;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 68
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Back Stack Index: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lc/l/d/o1;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 69
    iget-object p2, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    monitor-enter p2

    .line 70
    :try_start_0
    iget-object v0, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 71
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Pending Actions:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_2
    if-ge p4, v0, :cond_2

    .line 72
    iget-object v1, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/l1;

    .line 73
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    .line 74
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    .line 76
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 77
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    .line 78
    :cond_2
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    .line 80
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 81
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    .line 82
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 83
    iget-object p2, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 84
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    .line 85
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 86
    iget-object p2, p0, Lc/l/d/o1;->s:Lc/l/d/n0;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 87
    iget-object p2, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_3

    .line 88
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    .line 89
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 90
    iget-object p2, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 91
    :cond_3
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    .line 92
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 93
    iget p2, p0, Lc/l/d/o1;->q:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    .line 94
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 95
    iget-boolean p2, p0, Lc/l/d/o1;->E:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    .line 96
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 97
    iget-boolean p2, p0, Lc/l/d/o1;->F:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    .line 98
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 99
    iget-boolean p2, p0, Lc/l/d/o1;->G:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 100
    iget-boolean p2, p0, Lc/l/d/o1;->D:Z

    if-eqz p2, :cond_4

    .line 101
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    .line 102
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 103
    iget-boolean p1, p0, Lc/l/d/o1;->D:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_4
    return-void

    :catchall_0
    move-exception p1

    .line 104
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_5

    .line 209
    iget-object v3, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/n1;

    const/4 v4, -0x1

    if-eqz p1, :cond_1

    .line 210
    iget-boolean v5, v3, Lc/l/d/n1;->a:Z

    if-nez v5, :cond_1

    .line 211
    iget-object v5, v3, Lc/l/d/n1;->b:Lc/l/d/a;

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v5

    if-eq v5, v4, :cond_1

    if-eqz p2, :cond_1

    .line 212
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 213
    iget-object v4, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v0, v0, -0x1

    .line 214
    invoke-virtual {v3}, Lc/l/d/n1;->c()V

    goto :goto_2

    .line 215
    :cond_1
    invoke-virtual {v3}, Lc/l/d/n1;->e()Z

    move-result v5

    if-nez v5, :cond_2

    if-eqz p1, :cond_4

    iget-object v5, v3, Lc/l/d/n1;->b:Lc/l/d/a;

    .line 216
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v5, p1, v1, v6}, Lc/l/d/a;->a(Ljava/util/ArrayList;II)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 217
    :cond_2
    iget-object v5, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v0, v0, -0x1

    if-eqz p1, :cond_3

    .line 218
    iget-boolean v5, v3, Lc/l/d/n1;->a:Z

    if-nez v5, :cond_3

    iget-object v5, v3, Lc/l/d/n1;->b:Lc/l/d/a;

    .line 219
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v5

    if-eq v5, v4, :cond_3

    if-eqz p2, :cond_3

    .line 220
    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 221
    invoke-virtual {v3}, Lc/l/d/n1;->c()V

    goto :goto_2

    .line 222
    :cond_3
    invoke-virtual {v3}, Lc/l/d/n1;->d()V

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    move-object/from16 v5, p2

    move/from16 v4, p3

    move/from16 v3, p4

    .line 223
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/l/d/a;

    iget-boolean v2, v0, Lc/l/d/e2;->o:Z

    .line 224
    iget-object v0, v6, Lc/l/d/o1;->K:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v6, Lc/l/d/o1;->K:Ljava/util/ArrayList;

    goto :goto_0

    .line 226
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 227
    :goto_0
    iget-object v0, v6, Lc/l/d/o1;->K:Ljava/util/ArrayList;

    iget-object v1, v6, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 228
    invoke-virtual/range {p0 .. p0}, Lc/l/d/o1;->E()Landroidx/fragment/app/Fragment;

    move-result-object v0

    const/4 v1, 0x0

    move v7, v4

    const/16 v16, 0x0

    :goto_1
    const/4 v14, 0x1

    if-ge v7, v3, :cond_4

    .line 229
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc/l/d/a;

    .line 230
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_1

    .line 231
    iget-object v9, v6, Lc/l/d/o1;->K:Ljava/util/ArrayList;

    invoke-virtual {v8, v9, v0}, Lc/l/d/a;->a(Ljava/util/ArrayList;Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    goto :goto_2

    .line 232
    :cond_1
    iget-object v9, v6, Lc/l/d/o1;->K:Ljava/util/ArrayList;

    invoke-virtual {v8, v9, v0}, Lc/l/d/a;->b(Ljava/util/ArrayList;Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    :goto_2
    if-nez v16, :cond_3

    .line 233
    iget-boolean v8, v8, Lc/l/d/e2;->g:Z

    if-eqz v8, :cond_2

    goto :goto_3

    :cond_2
    const/16 v16, 0x0

    goto :goto_4

    :cond_3
    :goto_3
    const/16 v16, 0x1

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 234
    :cond_4
    iget-object v0, v6, Lc/l/d/o1;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    if-nez v2, :cond_8

    .line 235
    iget v0, v6, Lc/l/d/o1;->q:I

    if-lt v0, v14, :cond_8

    .line 236
    sget-boolean v0, Lc/l/d/o1;->P:Z

    if-eqz v0, :cond_7

    move v0, v4

    :goto_5
    if-ge v0, v3, :cond_8

    .line 237
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/a;

    .line 238
    iget-object v1, v1, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc/l/d/d2;

    .line 239
    iget-object v7, v7, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v7, :cond_5

    .line 240
    iget-object v8, v7, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    if-eqz v8, :cond_5

    .line 241
    invoke-virtual {v6, v7}, Lc/l/d/o1;->e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;

    move-result-object v7

    .line 242
    iget-object v8, v6, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v8, v7}, Lc/l/d/c2;->a(Lc/l/d/a2;)V

    goto :goto_6

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 243
    :cond_7
    iget-object v0, v6, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v7

    iget-object v8, v6, Lc/l/d/o1;->s:Lc/l/d/n0;

    const/4 v13, 0x0

    iget-object v0, v6, Lc/l/d/o1;->n:Lc/l/d/l2;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move/from16 v11, p3

    move/from16 v12, p4

    const/4 v1, 0x1

    move-object v14, v0

    invoke-static/range {v7 .. v14}, Lc/l/d/n2;->a(Landroid/content/Context;Lc/l/d/n0;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZLc/l/d/l2;)V

    goto :goto_7

    :cond_8
    const/4 v1, 0x1

    .line 244
    :goto_7
    invoke-static/range {p1 .. p4}, Lc/l/d/o1;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 245
    sget-boolean v0, Lc/l/d/o1;->P:Z

    if-eqz v0, :cond_f

    add-int/lit8 v0, v3, -0x1

    .line 246
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v2, v4

    :goto_8
    if-ge v2, v3, :cond_d

    .line 247
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lc/l/d/a;

    if-eqz v0, :cond_a

    .line 248
    iget-object v8, v7, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v1

    :goto_9
    if-ltz v8, :cond_c

    .line 249
    iget-object v9, v7, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lc/l/d/d2;

    .line 250
    iget-object v9, v9, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v9, :cond_9

    .line 251
    invoke-virtual {v6, v9}, Lc/l/d/o1;->e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;

    move-result-object v9

    .line 252
    invoke-virtual {v9}, Lc/l/d/a2;->l()V

    :cond_9
    add-int/lit8 v8, v8, -0x1

    goto :goto_9

    .line 253
    :cond_a
    iget-object v7, v7, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_b
    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc/l/d/d2;

    .line 254
    iget-object v8, v8, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-eqz v8, :cond_b

    .line 255
    invoke-virtual {v6, v8}, Lc/l/d/o1;->e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;

    move-result-object v8

    .line 256
    invoke-virtual {v8}, Lc/l/d/a2;->l()V

    goto :goto_a

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 257
    :cond_d
    iget v2, v6, Lc/l/d/o1;->q:I

    invoke-virtual {v6, v2, v1}, Lc/l/d/o1;->a(IZ)V

    .line 258
    invoke-virtual {v6, v15, v4, v3}, Lc/l/d/o1;->a(Ljava/util/ArrayList;II)Ljava/util/Set;

    move-result-object v1

    .line 259
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/i3;

    .line 260
    invoke-virtual {v2, v0}, Lc/l/d/i3;->a(Z)V

    .line 261
    invoke-virtual {v2}, Lc/l/d/i3;->e()V

    .line 262
    invoke-virtual {v2}, Lc/l/d/i3;->a()V

    goto :goto_b

    :cond_e
    move v0, v3

    move-object v3, v5

    goto/16 :goto_e

    :cond_f
    if-eqz v2, :cond_10

    .line 263
    new-instance v7, Lc/e/d;

    invoke-direct {v7}, Lc/e/d;-><init>()V

    .line 264
    invoke-virtual {v6, v7}, Lc/l/d/o1;->a(Lc/e/d;)V

    move-object/from16 v0, p0

    const/4 v14, 0x1

    move-object/from16 v1, p1

    move v8, v2

    move-object/from16 v2, p2

    move v13, v3

    move/from16 v3, p3

    move v12, v4

    move/from16 v4, p4

    move-object v11, v5

    move-object v5, v7

    .line 265
    invoke-virtual/range {v0 .. v5}, Lc/l/d/o1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;IILc/e/d;)I

    move-result v0

    .line 266
    invoke-virtual {v6, v7}, Lc/l/d/o1;->b(Lc/e/d;)V

    goto :goto_c

    :cond_10
    move v8, v2

    move v13, v3

    move v12, v4

    move-object v11, v5

    const/4 v14, 0x1

    move v0, v13

    :goto_c
    if-eq v0, v12, :cond_12

    if-eqz v8, :cond_12

    .line 267
    iget v1, v6, Lc/l/d/o1;->q:I

    if-lt v1, v14, :cond_11

    .line 268
    iget-object v1, v6, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v1}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v7

    iget-object v8, v6, Lc/l/d/o1;->s:Lc/l/d/n0;

    const/4 v1, 0x1

    iget-object v2, v6, Lc/l/d/o1;->n:Lc/l/d/l2;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object v3, v11

    move/from16 v11, p3

    move v12, v0

    move v0, v13

    move v13, v1

    const/4 v1, 0x1

    move-object v14, v2

    invoke-static/range {v7 .. v14}, Lc/l/d/n2;->a(Landroid/content/Context;Lc/l/d/n0;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZLc/l/d/l2;)V

    goto :goto_d

    :cond_11
    move-object v3, v11

    move v0, v13

    const/4 v1, 0x1

    .line 269
    :goto_d
    iget v2, v6, Lc/l/d/o1;->q:I

    invoke-virtual {v6, v2, v1}, Lc/l/d/o1;->a(IZ)V

    goto :goto_e

    :cond_12
    move-object v3, v11

    move v0, v13

    :goto_e
    move/from16 v1, p3

    :goto_f
    if-ge v1, v0, :cond_14

    .line 270
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/a;

    .line 271
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_13

    .line 272
    iget v4, v2, Lc/l/d/a;->s:I

    if-ltz v4, :cond_13

    const/4 v4, -0x1

    .line 273
    iput v4, v2, Lc/l/d/a;->s:I

    .line 274
    :cond_13
    invoke-virtual {v2}, Lc/l/d/a;->h()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_14
    if-eqz v16, :cond_15

    .line 275
    invoke-virtual/range {p0 .. p0}, Lc/l/d/o1;->L()V

    :cond_15
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 429
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_0

    .line 430
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->f(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 7

    .line 433
    iget v0, p0, Lc/l/d/o1;->q:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 434
    iget-object v3, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v3}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/Fragment;

    if-eqz v5, :cond_1

    .line 435
    invoke-virtual {p0, v5}, Lc/l/d/o1;->p(Landroidx/fragment/app/Fragment;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5, p1, p2}, Landroidx/fragment/app/Fragment;->b(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v6

    if-eqz v6, :cond_1

    if-nez v0, :cond_2

    .line 436
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 437
    :cond_2
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x1

    goto :goto_0

    .line 438
    :cond_3
    iget-object p1, p0, Lc/l/d/o1;->e:Ljava/util/ArrayList;

    if-eqz p1, :cond_6

    .line 439
    :goto_1
    iget-object p1, p0, Lc/l/d/o1;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_6

    .line 440
    iget-object p1, p0, Lc/l/d/o1;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_4

    .line 441
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 442
    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 443
    :cond_6
    iput-object v0, p0, Lc/l/d/o1;->e:Ljava/util/ArrayList;

    return v4
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 4

    .line 444
    iget v0, p0, Lc/l/d/o1;->q:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    .line 445
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_1

    .line 446
    invoke-virtual {v3, p1}, Landroidx/fragment/app/Fragment;->c(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final a(Ljava/lang/String;II)Z
    .locals 8

    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, v0}, Lc/l/d/o1;->d(Z)Z

    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, v0}, Lc/l/d/o1;->c(Z)V

    .line 16
    iget-object v1, p0, Lc/l/d/o1;->u:Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_0

    if-gez p2, :cond_0

    if-nez p1, :cond_0

    .line 17
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;

    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lc/l/d/o1;->K()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    .line 19
    :cond_0
    iget-object v3, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    iget-object v4, p0, Lc/l/d/o1;->J:Ljava/util/ArrayList;

    move-object v2, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    invoke-virtual/range {v2 .. v7}, Lc/l/d/o1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 20
    iput-boolean v0, p0, Lc/l/d/o1;->b:Z

    .line 21
    :try_start_0
    iget-object p2, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    iget-object p3, p0, Lc/l/d/o1;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, p2, p3}, Lc/l/d/o1;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {p0}, Lc/l/d/o1;->e()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc/l/d/o1;->e()V

    .line 23
    throw p1

    .line 24
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lc/l/d/o1;->P()V

    .line 25
    invoke-virtual {p0}, Lc/l/d/o1;->s()V

    .line 26
    iget-object p2, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {p2}, Lc/l/d/c2;->a()V

    return p1
.end method

.method public a(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            "II)Z"
        }
    .end annotation

    .line 323
    iget-object v0, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-nez p3, :cond_2

    if-gez p4, :cond_2

    and-int/lit8 v3, p5, 0x1

    if-nez v3, :cond_2

    .line 324
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v2

    if-gez p3, :cond_1

    return v1

    .line 325
    :cond_1
    iget-object p4, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_2
    if-nez p3, :cond_4

    if-ltz p4, :cond_3

    goto :goto_0

    :cond_3
    const/4 p3, -0x1

    goto :goto_4

    .line 327
    :cond_4
    :goto_0
    iget-object v0, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v2

    :goto_1
    if-ltz v0, :cond_7

    .line 328
    iget-object v3, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/a;

    if-eqz p3, :cond_5

    .line 329
    invoke-virtual {v3}, Lc/l/d/a;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    if-ltz p4, :cond_6

    .line 330
    iget v3, v3, Lc/l/d/a;->s:I

    if-ne p4, v3, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_7
    :goto_2
    if-gez v0, :cond_8

    return v1

    :cond_8
    and-int/2addr p5, v2

    if-eqz p5, :cond_b

    :cond_9
    :goto_3
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_b

    .line 331
    iget-object p5, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {p5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lc/l/d/a;

    if-eqz p3, :cond_a

    .line 332
    invoke-virtual {p5}, Lc/l/d/a;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_a
    if-ltz p4, :cond_b

    iget p5, p5, Lc/l/d/a;->s:I

    if-ne p4, p5, :cond_b

    goto :goto_3

    :cond_b
    move p3, v0

    .line 333
    :goto_4
    iget-object p4, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    sub-int/2addr p4, v2

    if-ne p3, p4, :cond_c

    return v1

    .line 334
    :cond_c
    iget-object p4, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    sub-int/2addr p4, v2

    :goto_5
    if-le p4, p3, :cond_d

    .line 335
    iget-object p5, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p5

    invoke-virtual {p2, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p4, p4, -0x1

    goto :goto_5

    :cond_d
    :goto_6
    return v2
.end method

.method public b(I)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 17
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0, p1}, Lc/l/d/c2;->b(I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 18
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0, p1}, Lc/l/d/c2;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public b()Lc/l/d/e2;
    .locals 1

    .line 2
    new-instance v0, Lc/l/d/a;

    invoke-direct {v0, p0}, Lc/l/d/a;-><init>(Lc/l/d/o1;)V

    return-object v0
.end method

.method public b(Landroidx/fragment/app/Fragment;)V
    .locals 4

    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "attach: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->B:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->B:Z

    .line 12
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->m:Z

    if-nez v1, :cond_2

    .line 13
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1, p1}, Lc/l/d/c2;->a(Landroidx/fragment/app/Fragment;)V

    .line 14
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "add from attach: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Lc/l/d/o1;->o(Landroidx/fragment/app/Fragment;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lc/l/d/o1;->D:Z

    :cond_2
    return-void
.end method

.method public b(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 5
    iget-object p2, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget p2, p1, Landroidx/fragment/app/Fragment;->b:I

    const/4 v0, 0x5

    if-ge p2, v0, :cond_0

    .line 7
    invoke-virtual {p0, p1}, Lc/l/d/o1;->f(Landroidx/fragment/app/Fragment;)V

    .line 8
    invoke-virtual {p0, p1}, Lc/l/d/o1;->s(Landroidx/fragment/app/Fragment;)V

    :cond_0
    return-void
.end method

.method public final b(Lc/e/d;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/e/d<",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-virtual {p1}, Lc/e/d;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 30
    invoke-virtual {p1, v1}, Lc/e/d;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 31
    iget-boolean v3, v2, Landroidx/fragment/app/Fragment;->m:Z

    if-nez v3, :cond_0

    .line 32
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;

    move-result-object v3

    .line 33
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    move-result v4

    iput v4, v2, Landroidx/fragment/app/Fragment;->O:F

    const/4 v2, 0x0

    .line 34
    invoke-virtual {v3, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b(Lc/l/d/l1;Z)V
    .locals 1

    if-eqz p2, :cond_1

    .line 19
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lc/l/d/o1;->G:Z

    if-eqz v0, :cond_1

    :cond_0
    return-void

    .line 20
    :cond_1
    invoke-virtual {p0, p2}, Lc/l/d/o1;->c(Z)V

    .line 21
    iget-object p2, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    iget-object v0, p0, Lc/l/d/o1;->J:Ljava/util/ArrayList;

    invoke-interface {p1, p2, v0}, Lc/l/d/l1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lc/l/d/o1;->b:Z

    .line 23
    :try_start_0
    iget-object p1, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    iget-object p2, p0, Lc/l/d/o1;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Lc/l/d/o1;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-virtual {p0}, Lc/l/d/o1;->e()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc/l/d/o1;->e()V

    .line 25
    throw p1

    .line 26
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lc/l/d/o1;->P()V

    .line 27
    invoke-virtual {p0}, Lc/l/d/o1;->s()V

    .line 28
    iget-object p1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {p1}, Lc/l/d/c2;->a()V

    return-void
.end method

.method public b(Z)V
    .locals 2

    .line 49
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_0

    .line 50
    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->g(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b(Landroid/view/Menu;)Z
    .locals 5

    .line 51
    iget v0, p0, Lc/l/d/o1;->q:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    .line 52
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_1

    .line 53
    invoke-virtual {p0, v3}, Lc/l/d/o1;->p(Landroidx/fragment/app/Fragment;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, p1}, Landroidx/fragment/app/Fragment;->d(Landroid/view/Menu;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 4

    .line 54
    iget v0, p0, Lc/l/d/o1;->q:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    .line 55
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_1

    .line 56
    invoke-virtual {v3, p1}, Landroidx/fragment/app/Fragment;->d(Landroid/view/MenuItem;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_2
    return v1
.end method

.method public final b(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    monitor-enter v0

    .line 42
    :try_start_0
    iget-object v1, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 43
    monitor-exit v0

    return v2

    .line 44
    :cond_0
    iget-object v1, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 45
    iget-object v4, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/l/d/l1;

    invoke-interface {v4, p1, p2}, Lc/l/d/l1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v4

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 46
    :cond_1
    iget-object p1, p0, Lc/l/d/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 47
    iget-object p1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {p1}, Lc/l/d/r0;->i()Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lc/l/d/o1;->N:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 48
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 9
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0, p1}, Lc/l/d/c2;->c(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public final c(Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 3
    iget-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashSet;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/h/j/c;

    .line 5
    invoke-virtual {v2}, Lc/h/j/c;->a()V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 7
    invoke-virtual {p0, p1}, Lc/l/d/o1;->f(Landroidx/fragment/app/Fragment;)V

    .line 8
    iget-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final c(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 28
    invoke-virtual {p0, p1, p2}, Lc/l/d/o1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 29
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    .line 30
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/a;

    iget-boolean v3, v3, Lc/l/d/e2;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    .line 31
    invoke-virtual {p0, p1, p2, v2, v1}, Lc/l/d/o1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 32
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    .line 33
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 34
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/a;

    iget-boolean v3, v3, Lc/l/d/e2;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 35
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Lc/l/d/o1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    .line 36
    invoke-virtual {p0, p1, p2, v2, v0}, Lc/l/d/o1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    return-void

    .line 37
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Z)V
    .locals 2

    .line 10
    iget-boolean v0, p0, Lc/l/d/o1;->b:Z

    if-nez v0, :cond_5

    .line 11
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-nez v0, :cond_1

    .line 12
    iget-boolean p1, p0, Lc/l/d/o1;->G:Z

    if-eqz p1, :cond_0

    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has not been attached to a host."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {v1}, Lc/l/d/r0;->i()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_4

    if-nez p1, :cond_2

    .line 16
    invoke-virtual {p0}, Lc/l/d/o1;->d()V

    .line 17
    :cond_2
    iget-object p1, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    if-nez p1, :cond_3

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    .line 19
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc/l/d/o1;->J:Ljava/util/ArrayList;

    :cond_3
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lc/l/d/o1;->b:Z

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 21
    :try_start_0
    invoke-virtual {p0, v0, v0}, Lc/l/d/o1;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    iput-boolean p1, p0, Lc/l/d/o1;->b:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean p1, p0, Lc/l/d/o1;->b:Z

    .line 23
    throw v0

    .line 24
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Z
    .locals 4

    .line 38
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_1

    .line 39
    invoke-virtual {p0, v3}, Lc/l/d/o1;->o(Landroidx/fragment/app/Fragment;)Z

    move-result v2

    :cond_1
    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public c(I)Z
    .locals 1

    .line 2
    iget v0, p0, Lc/l/d/o1;->q:I

    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 26
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0, p1}, Lc/l/d/c2;->d(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public final d()V
    .locals 2

    .line 27
    invoke-virtual {p0}, Lc/l/d/o1;->I()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 28
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Landroidx/fragment/app/Fragment;)V
    .locals 6

    .line 2
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 3
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    .line 4
    invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v0

    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->A:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->A()Z

    move-result v3

    .line 5
    invoke-static {v0, p1, v2, v3}, Lc/l/d/m0;->a(Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Lc/l/d/k0;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v2, v0, Lc/l/d/k0;->b:Landroid/animation/Animator;

    if-eqz v2, :cond_2

    .line 7
    iget-object v3, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 8
    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->A:Z

    if-eqz v2, :cond_1

    .line 9
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->S()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 10
    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->h(Z)V

    goto :goto_0

    .line 11
    :cond_0
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    .line 12
    iget-object v3, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 13
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 14
    iget-object v4, v0, Lc/l/d/k0;->b:Landroid/animation/Animator;

    new-instance v5, Lc/l/d/d1;

    invoke-direct {v5, p0, v2, v3, p1}, Lc/l/d/d1;-><init>(Lc/l/d/o1;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;)V

    invoke-virtual {v4, v5}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_0

    .line 15
    :cond_1
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    :goto_0
    iget-object v0, v0, Lc/l/d/k0;->b:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    .line 17
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    iget-object v3, v0, Lc/l/d/k0;->a:Landroid/view/animation/Animation;

    invoke-virtual {v2, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 18
    iget-object v0, v0, Lc/l/d/k0;->a:Landroid/view/animation/Animation;

    invoke-virtual {v0}, Landroid/view/animation/Animation;->start()V

    .line 19
    :cond_3
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->A:Z

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->S()Z

    move-result v0

    if-nez v0, :cond_4

    const/16 v0, 0x8

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    .line 20
    :goto_1
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->S()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 22
    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->h(Z)V

    .line 23
    :cond_5
    :goto_2
    invoke-virtual {p0, p1}, Lc/l/d/o1;->n(Landroidx/fragment/app/Fragment;)V

    .line 24
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->N:Z

    .line 25
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->A:Z

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->b(Z)V

    return-void
.end method

.method public d(Z)Z
    .locals 3

    .line 29
    invoke-virtual {p0, p1}, Lc/l/d/o1;->c(Z)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    .line 30
    :goto_0
    iget-object v1, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    iget-object v2, p0, Lc/l/d/o1;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2}, Lc/l/d/o1;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 31
    iput-boolean p1, p0, Lc/l/d/o1;->b:Z

    .line 32
    :try_start_0
    iget-object v0, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    iget-object v1, p0, Lc/l/d/o1;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, v1}, Lc/l/d/o1;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-virtual {p0}, Lc/l/d/o1;->e()V

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc/l/d/o1;->e()V

    .line 34
    throw p1

    .line 35
    :cond_0
    invoke-virtual {p0}, Lc/l/d/o1;->P()V

    .line 36
    invoke-virtual {p0}, Lc/l/d/o1;->s()V

    .line 37
    iget-object p1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {p1}, Lc/l/d/c2;->a()V

    return v0
.end method

.method public e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    iget-object v1, p1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc/l/d/c2;->e(Ljava/lang/String;)Lc/l/d/a2;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Lc/l/d/a2;

    iget-object v1, p0, Lc/l/d/o1;->o:Lc/l/d/v0;

    iget-object v2, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-direct {v0, v1, v2, p1}, Lc/l/d/a2;-><init>(Lc/l/d/v0;Lc/l/d/c2;Landroidx/fragment/app/Fragment;)V

    .line 3
    iget-object p1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-virtual {p1}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, Lc/l/d/a2;->a(Ljava/lang/ClassLoader;)V

    .line 4
    iget p1, p0, Lc/l/d/o1;->q:I

    invoke-virtual {v0, p1}, Lc/l/d/a2;->a(I)V

    return-object v0
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lc/l/d/o1;->b:Z

    .line 6
    iget-object v0, p0, Lc/l/d/o1;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    iget-object v0, p0, Lc/l/d/o1;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final f()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lc/l/d/i3;",
            ">;"
        }
    .end annotation

    .line 8
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 9
    iget-object v1, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v1}, Lc/l/d/c2;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/a2;

    .line 10
    invoke-virtual {v2}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v2

    iget-object v2, v2, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    .line 11
    invoke-virtual {p0}, Lc/l/d/o1;->F()Lc/l/d/j3;

    move-result-object v3

    .line 12
    invoke-static {v2, v3}, Lc/l/d/i3;->a(Landroid/view/ViewGroup;Lc/l/d/j3;)Lc/l/d/i3;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final f(Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->l0()V

    .line 2
    iget-object v0, p0, Lc/l/d/o1;->o:Lc/l/d/v0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->i(Landroidx/fragment/app/Fragment;Z)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    .line 4
    iput-object v0, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 5
    iput-object v0, p1, Landroidx/fragment/app/Fragment;->T:Lc/l/d/y2;

    .line 6
    iget-object v2, p1, Landroidx/fragment/app/Fragment;->U:Lc/n/p;

    invoke-virtual {v2, v0}, Lc/n/p;->a(Ljava/lang/Object;)V

    .line 7
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->p:Z

    return-void
.end method

.method public g()V
    .locals 2

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lc/l/d/o1;->E:Z

    .line 11
    iput-boolean v0, p0, Lc/l/d/o1;->F:Z

    .line 12
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v1, v0}, Lc/l/d/t1;->a(Z)V

    const/4 v0, 0x4

    .line 13
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public g(Landroidx/fragment/app/Fragment;)V
    .locals 4

    const/4 v0, 0x2

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "detach: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->B:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->B:Z

    .line 4
    iget-boolean v3, p1, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz v3, :cond_3

    .line 5
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "remove from detach: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    :cond_1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0, p1}, Lc/l/d/c2;->c(Landroidx/fragment/app/Fragment;)V

    .line 7
    invoke-virtual {p0, p1}, Lc/l/d/o1;->o(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iput-boolean v1, p0, Lc/l/d/o1;->D:Z

    .line 9
    :cond_2
    invoke-virtual {p0, p1}, Lc/l/d/o1;->w(Landroidx/fragment/app/Fragment;)V

    :cond_3
    return-void
.end method

.method public h()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/l/d/o1;->E:Z

    .line 2
    iput-boolean v0, p0, Lc/l/d/o1;->F:Z

    .line 3
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v1, v0}, Lc/l/d/t1;->a(Z)V

    .line 4
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public h(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 5
    iget-object v0, p0, Lc/l/d/o1;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u1;

    .line 6
    invoke-interface {v1, p0, p1}, Lc/l/d/u1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/l/d/o1;->E:Z

    .line 2
    iput-boolean v0, p0, Lc/l/d/o1;->F:Z

    .line 3
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v1, v0}, Lc/l/d/t1;->a(Z)V

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public final i(Landroidx/fragment/app/Fragment;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lc/l/d/o1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p0()V

    :cond_0
    return-void
.end method

.method public final j(Landroidx/fragment/app/Fragment;)Lc/l/d/t1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v0, p1}, Lc/l/d/t1;->c(Landroidx/fragment/app/Fragment;)Lc/l/d/t1;

    move-result-object p1

    return-object p1
.end method

.method public j()V
    .locals 2

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lc/l/d/o1;->G:Z

    .line 3
    invoke-virtual {p0, v0}, Lc/l/d/o1;->d(Z)Z

    .line 4
    invoke-virtual {p0}, Lc/l/d/o1;->t()V

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    .line 7
    iput-object v0, p0, Lc/l/d/o1;->s:Lc/l/d/n0;

    .line 8
    iput-object v0, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    .line 9
    iget-object v1, p0, Lc/l/d/o1;->g:Landroidx/activity/OnBackPressedDispatcher;

    if-eqz v1, :cond_0

    .line 10
    iget-object v1, p0, Lc/l/d/o1;->h:Lc/a/g;

    invoke-virtual {v1}, Lc/a/g;->c()V

    .line 11
    iput-object v0, p0, Lc/l/d/o1;->g:Landroidx/activity/OnBackPressedDispatcher;

    .line 12
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->z:Lc/a/k/d;

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {v0}, Lc/a/k/d;->a()V

    .line 14
    iget-object v0, p0, Lc/l/d/o1;->A:Lc/a/k/d;

    invoke-virtual {v0}, Lc/a/k/d;->a()V

    .line 15
    iget-object v0, p0, Lc/l/d/o1;->B:Lc/a/k/d;

    invoke-virtual {v0}, Lc/a/k/d;->a()V

    :cond_1
    return-void
.end method

.method public final k(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    iget v0, p1, Landroidx/fragment/app/Fragment;->y:I

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    return-object v1

    .line 3
    :cond_1
    iget-object v0, p0, Lc/l/d/o1;->s:Lc/l/d/n0;

    invoke-virtual {v0}, Lc/l/d/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p0, Lc/l/d/o1;->s:Lc/l/d/n0;

    iget p1, p1, Landroidx/fragment/app/Fragment;->y:I

    invoke-virtual {v0, p1}, Lc/l/d/n0;->a(I)Landroid/view/View;

    move-result-object p1

    .line 5
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 6
    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    return-object v1
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public l(Landroidx/fragment/app/Fragment;)Lc/n/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v0, p1}, Lc/l/d/t1;->d(Landroidx/fragment/app/Fragment;)Lc/n/x;

    move-result-object p1

    return-object p1
.end method

.method public l()V
    .locals 2

    .line 2
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->n0()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public m()V
    .locals 1

    const/4 v0, 0x5

    .line 6
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public m(Landroidx/fragment/app/Fragment;)V
    .locals 2

    const/4 v0, 0x2

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hide: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->A:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->A:Z

    .line 4
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->N:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->N:Z

    .line 5
    invoke-virtual {p0, p1}, Lc/l/d/o1;->w(Landroidx/fragment/app/Fragment;)V

    :cond_1
    return-void
.end method

.method public n()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/l/d/o1;->P()V

    .line 2
    iget-object v0, p0, Lc/l/d/o1;->u:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0, v0}, Lc/l/d/o1;->i(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public n(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 3
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lc/l/d/o1;->o(Landroidx/fragment/app/Fragment;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lc/l/d/o1;->D:Z

    :cond_0
    return-void
.end method

.method public o()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lc/l/d/o1;->E:Z

    .line 2
    iput-boolean v0, p0, Lc/l/d/o1;->F:Z

    .line 3
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v1, v0}, Lc/l/d/t1;->a(Z)V

    const/4 v0, 0x7

    .line 4
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public final o(Landroidx/fragment/app/Fragment;)Z
    .locals 1

    .line 5
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->E:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->F:Z

    if-nez v0, :cond_1

    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->v:Lc/l/d/o1;

    invoke-virtual {p1}, Lc/l/d/o1;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public p()V
    .locals 2

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc/l/d/o1;->E:Z

    .line 3
    iput-boolean v0, p0, Lc/l/d/o1;->F:Z

    .line 4
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v1, v0}, Lc/l/d/t1;->a(Z)V

    const/4 v0, 0x5

    .line 5
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public p(Landroidx/fragment/app/Fragment;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->U()Z

    move-result p1

    return p1
.end method

.method public q()V
    .locals 2

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lc/l/d/o1;->F:Z

    .line 6
    iget-object v1, p0, Lc/l/d/o1;->M:Lc/l/d/t1;

    invoke-virtual {v1, v0}, Lc/l/d/t1;->a(Z)V

    const/4 v0, 0x4

    .line 7
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public q(Landroidx/fragment/app/Fragment;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    iget-object v1, p1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    .line 2
    invoke-virtual {v1}, Lc/l/d/o1;->E()Landroidx/fragment/app/Fragment;

    move-result-object v2

    .line 3
    invoke-virtual {p1, v2}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v1, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    .line 4
    invoke-virtual {p0, p1}, Lc/l/d/o1;->q(Landroidx/fragment/app/Fragment;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public r()V
    .locals 1

    const/4 v0, 0x2

    .line 20
    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(I)V

    return-void
.end method

.method public r(Landroidx/fragment/app/Fragment;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    iget-object v1, p1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc/l/d/c2;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring moving "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to state "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lc/l/d/o1;->q:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "since it is not added to "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    .line 4
    :cond_1
    invoke-virtual {p0, p1}, Lc/l/d/o1;->s(Landroidx/fragment/app/Fragment;)V

    .line 5
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 6
    iget-boolean v1, p1, Landroidx/fragment/app/Fragment;->M:Z

    if-eqz v1, :cond_4

    iget-object v1, p1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v1, :cond_4

    .line 7
    iget v1, p1, Landroidx/fragment/app/Fragment;->O:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-lez v3, :cond_2

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 9
    :cond_2
    iput v2, p1, Landroidx/fragment/app/Fragment;->O:F

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->M:Z

    .line 11
    iget-object v0, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    .line 12
    invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->A()Z

    move-result v2

    .line 13
    invoke-static {v0, p1, v1, v2}, Lc/l/d/m0;->a(Landroid/content/Context;Landroidx/fragment/app/Fragment;ZZ)Lc/l/d/k0;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 14
    iget-object v1, v0, Lc/l/d/k0;->a:Landroid/view/animation/Animation;

    if-eqz v1, :cond_3

    .line 15
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 16
    :cond_3
    iget-object v1, v0, Lc/l/d/k0;->b:Landroid/animation/Animator;

    iget-object v2, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 17
    iget-object v0, v0, Lc/l/d/k0;->b:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 18
    :cond_4
    :goto_0
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->N:Z

    if-eqz v0, :cond_5

    .line 19
    invoke-virtual {p0, p1}, Lc/l/d/o1;->d(Landroidx/fragment/app/Fragment;)V

    :cond_5
    return-void
.end method

.method public final s()V
    .locals 1

    .line 2
    iget-boolean v0, p0, Lc/l/d/o1;->H:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lc/l/d/o1;->H:Z

    .line 4
    invoke-virtual {p0}, Lc/l/d/o1;->O()V

    :cond_0
    return-void
.end method

.method public s(Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    iget v0, p0, Lc/l/d/o1;->q:I

    invoke-virtual {p0, p1, v0}, Lc/l/d/o1;->a(Landroidx/fragment/app/Fragment;I)V

    return-void
.end method

.method public final t()V
    .locals 2

    .line 10
    sget-boolean v0, Lc/l/d/o1;->P:Z

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p0}, Lc/l/d/o1;->f()Ljava/util/Set;

    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/i3;

    .line 13
    invoke-virtual {v1}, Lc/l/d/i3;->b()V

    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 15
    iget-object v0, p0, Lc/l/d/o1;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 16
    invoke-virtual {p0, v1}, Lc/l/d/o1;->c(Landroidx/fragment/app/Fragment;)V

    .line 17
    invoke-virtual {p0, v1}, Lc/l/d/o1;->s(Landroidx/fragment/app/Fragment;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public t(Landroidx/fragment/app/Fragment;)V
    .locals 3

    const/4 v0, 0x2

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "remove: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " nesting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Landroidx/fragment/app/Fragment;->s:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->T()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 4
    iget-boolean v2, p1, Landroidx/fragment/app/Fragment;->B:Z

    if-eqz v2, :cond_1

    if-eqz v0, :cond_3

    .line 5
    :cond_1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0, p1}, Lc/l/d/c2;->c(Landroidx/fragment/app/Fragment;)V

    .line 6
    invoke-virtual {p0, p1}, Lc/l/d/o1;->o(Landroidx/fragment/app/Fragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iput-boolean v1, p0, Lc/l/d/o1;->D:Z

    .line 8
    :cond_2
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->n:Z

    .line 9
    invoke-virtual {p0, p1}, Lc/l/d/o1;->w(Landroidx/fragment/app/Fragment;)V

    :cond_3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    iget-object v1, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    iget-object v1, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    iget-object v1, p0, Lc/l/d/o1;->r:Lc/l/d/r0;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "}}"

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroidx/fragment/app/Fragment;)Lc/l/d/b0;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    iget-object v1, p1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc/l/d/c2;->e(Ljava/lang/String;)Lc/l/d/a2;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/l/d/a2;->p()Lc/l/d/b0;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not currently in the FragmentManager"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lc/l/d/o1;->a(Ljava/lang/RuntimeException;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final u()V
    .locals 2

    .line 5
    sget-boolean v0, Lc/l/d/o1;->P:Z

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lc/l/d/o1;->f()Ljava/util/Set;

    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/i3;

    .line 8
    invoke-virtual {v1}, Lc/l/d/i3;->c()V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 10
    :goto_1
    iget-object v0, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 11
    iget-object v0, p0, Lc/l/d/o1;->L:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/l/d/n1;

    invoke-virtual {v0}, Lc/l/d/n1;->d()V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public v()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public v(Landroidx/fragment/app/Fragment;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lc/l/d/o1;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->u:Lc/l/d/r0;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    if-ne v0, p0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p0, Lc/l/d/o1;->u:Landroidx/fragment/app/Fragment;

    .line 5
    iput-object p1, p0, Lc/l/d/o1;->u:Landroidx/fragment/app/Fragment;

    .line 6
    invoke-virtual {p0, v0}, Lc/l/d/o1;->i(Landroidx/fragment/app/Fragment;)V

    .line 7
    iget-object p1, p0, Lc/l/d/o1;->u:Landroidx/fragment/app/Fragment;

    invoke-virtual {p0, p1}, Lc/l/d/o1;->i(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public w()Lc/l/d/n0;
    .locals 1

    .line 7
    iget-object v0, p0, Lc/l/d/o1;->s:Lc/l/d/n0;

    return-object v0
.end method

.method public final w(Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lc/l/d/o1;->k(Landroidx/fragment/app/Fragment;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->n()I

    move-result v1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->q()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->B()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->C()I

    move-result v2

    add-int/2addr v1, v2

    if-lez v1, :cond_1

    .line 3
    sget v1, Lc/l/b;->visible_removing_fragment_view_tag:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 4
    sget v1, Lc/l/b;->visible_removing_fragment_view_tag:I

    invoke-virtual {v0, v1, p1}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    .line 5
    :cond_0
    sget v1, Lc/l/b;->visible_removing_fragment_view_tag:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 6
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->A()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->j(Z)V

    :cond_1
    return-void
.end method

.method public x()Lc/l/d/q0;
    .locals 1

    .line 5
    iget-object v0, p0, Lc/l/d/o1;->v:Lc/l/d/q0;

    if-eqz v0, :cond_0

    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lc/l/d/o1;->t:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->x()Lc/l/d/q0;

    move-result-object v0

    return-object v0

    .line 8
    :cond_1
    iget-object v0, p0, Lc/l/d/o1;->w:Lc/l/d/q0;

    return-object v0
.end method

.method public x(Landroidx/fragment/app/Fragment;)V
    .locals 2

    const/4 v0, 0x2

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "show: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->A:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->A:Z

    .line 4
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->N:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->N:Z

    :cond_1
    return-void
.end method

.method public y()Lc/l/d/c2;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    return-object v0
.end method

.method public z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/l/d/o1;->c:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
