.class public Lc/l/d/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/l/d/v0;

.field public final b:Lc/l/d/c2;

.field public final c:Landroidx/fragment/app/Fragment;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Lc/l/d/v0;Lc/l/d/c2;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc/l/d/a2;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lc/l/d/a2;->e:I

    .line 4
    iput-object p1, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    .line 5
    iput-object p2, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    .line 6
    iput-object p3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method public constructor <init>(Lc/l/d/v0;Lc/l/d/c2;Landroidx/fragment/app/Fragment;Lc/l/d/x1;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lc/l/d/a2;->d:Z

    const/4 v1, -0x1

    .line 34
    iput v1, p0, Lc/l/d/a2;->e:I

    .line 35
    iput-object p1, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    .line 36
    iput-object p2, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    .line 37
    iput-object p3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 p1, 0x0

    .line 38
    iput-object p1, p3, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    .line 39
    iput-object p1, p3, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    .line 40
    iput v0, p3, Landroidx/fragment/app/Fragment;->s:I

    .line 41
    iput-boolean v0, p3, Landroidx/fragment/app/Fragment;->p:Z

    .line 42
    iput-boolean v0, p3, Landroidx/fragment/app/Fragment;->m:Z

    .line 43
    iget-object p2, p3, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    .line 44
    iget-object p2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-object p1, p2, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    .line 45
    iget-object p1, p4, Lc/l/d/x1;->n:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 46
    iput-object p1, p2, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p2, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    :goto_1
    return-void
.end method

.method public constructor <init>(Lc/l/d/v0;Lc/l/d/c2;Ljava/lang/ClassLoader;Lc/l/d/q0;Lc/l/d/x1;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lc/l/d/a2;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lc/l/d/a2;->e:I

    .line 10
    iput-object p1, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    .line 11
    iput-object p2, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    .line 12
    iget-object p1, p5, Lc/l/d/x1;->b:Ljava/lang/String;

    invoke-virtual {p4, p3, p1}, Lc/l/d/q0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    iput-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    .line 13
    iget-object p1, p5, Lc/l/d/x1;->k:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p1, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15
    :cond_0
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object p2, p5, Lc/l/d/x1;->k:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->m(Landroid/os/Bundle;)V

    .line 16
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object p2, p5, Lc/l/d/x1;->c:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    .line 17
    iget-boolean p2, p5, Lc/l/d/x1;->d:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->o:Z

    const/4 p2, 0x1

    .line 18
    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->q:Z

    .line 19
    iget p2, p5, Lc/l/d/x1;->e:I

    iput p2, p1, Landroidx/fragment/app/Fragment;->x:I

    .line 20
    iget p2, p5, Lc/l/d/x1;->f:I

    iput p2, p1, Landroidx/fragment/app/Fragment;->y:I

    .line 21
    iget-object p2, p5, Lc/l/d/x1;->g:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->z:Ljava/lang/String;

    .line 22
    iget-boolean p2, p5, Lc/l/d/x1;->h:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->C:Z

    .line 23
    iget-boolean p2, p5, Lc/l/d/x1;->i:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->n:Z

    .line 24
    iget-boolean p2, p5, Lc/l/d/x1;->j:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->B:Z

    .line 25
    iget-boolean p2, p5, Lc/l/d/x1;->l:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->A:Z

    .line 26
    invoke-static {}, Lc/n/g$b;->values()[Lc/n/g$b;

    move-result-object p2

    iget p3, p5, Lc/l/d/x1;->m:I

    aget-object p2, p2, p3

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->R:Lc/n/g$b;

    .line 27
    iget-object p1, p5, Lc/l/d/x1;->n:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 28
    iget-object p2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-object p1, p2, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    goto :goto_0

    .line 29
    :cond_1
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    :goto_0
    const/4 p1, 0x2

    .line 30
    invoke-static {p1}, Lc/l/d/o1;->d(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Instantiated fragment "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v0, 0x3

    .line 15
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto ACTIVITY_CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->g(Landroid/os/Bundle;)V

    .line 18
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    return-void
.end method

.method public a(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/l/d/a2;->e:I

    return-void
.end method

.method public a(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 4
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    .line 5
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    const-string v1, "android:view_registry_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    .line 6
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    .line 7
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    const/4 v1, 0x0

    const-string v2, "android:target_req_state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p1, Landroidx/fragment/app/Fragment;->k:I

    .line 9
    :cond_1
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, p1, Landroidx/fragment/app/Fragment;->f:Ljava/lang/Boolean;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->K:Z

    .line 11
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/fragment/app/Fragment;->f:Ljava/lang/Boolean;

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    const-string v2, "android:user_visible_hint"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p1, Landroidx/fragment/app/Fragment;->K:Z

    .line 13
    :goto_0
    iget-object p1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->K:Z

    if-nez v0, :cond_3

    .line 14
    iput-boolean v1, p1, Landroidx/fragment/app/Fragment;->J:Z

    :cond_3
    return-void
.end method

.method public final a(Landroid/view/View;)Z
    .locals 2

    .line 19
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    return v1

    .line 20
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    .line 21
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-ne p1, v0, :cond_1

    return v1

    .line 22
    :cond_1
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Lc/l/d/c2;->b(Landroidx/fragment/app/Fragment;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public c()V
    .locals 6

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto ATTACHED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    const-string v2, " that does not belong to this FragmentManager!"

    const-string v3, " declared target fragment "

    const-string v4, "Fragment "

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    .line 4
    iget-object v0, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc/l/d/c2;->e(Ljava/lang/String;)Lc/l/d/a2;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v1, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    iget-object v2, v2, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    iput-object v2, v1, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    .line 6
    iput-object v5, v1, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    move-object v5, v0

    goto :goto_0

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v3, v3, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 9
    iget-object v1, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    invoke-virtual {v1, v0}, Lc/l/d/c2;->e(Ljava/lang/String;)Lc/l/d/a2;

    move-result-object v5

    if-eqz v5, :cond_3

    goto :goto_0

    .line 10
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v3, v3, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    if-eqz v5, :cond_6

    .line 11
    sget-boolean v0, Lc/l/d/o1;->P:Z

    if-nez v0, :cond_5

    .line 12
    invoke-virtual {v5}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget v0, v0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_6

    .line 13
    :cond_5
    invoke-virtual {v5}, Lc/l/d/a2;->l()V

    .line 14
    :cond_6
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    invoke-virtual {v1}, Lc/l/d/o1;->A()Lc/l/d/r0;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/Fragment;->u:Lc/l/d/r0;

    .line 15
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    invoke-virtual {v1}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/Fragment;

    .line 16
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc/l/d/v0;->e(Landroidx/fragment/app/Fragment;Z)V

    .line 17
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j0()V

    .line 18
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1, v2}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Z)V

    return-void
.end method

.method public d()I
    .locals 10

    .line 1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    if-nez v1, :cond_0

    .line 2
    iget v0, v0, Landroidx/fragment/app/Fragment;->b:I

    return v0

    .line 3
    :cond_0
    iget v1, p0, Lc/l/d/a2;->e:I

    .line 4
    sget-object v2, Lc/l/d/z1;->a:[I

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->R:Lc/n/g$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, -0x1

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v0, v7, :cond_4

    if-eq v0, v6, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v5, :cond_1

    .line 5
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 6
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 9
    :cond_4
    :goto_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v8, v0, Landroidx/fragment/app/Fragment;->o:Z

    if-eqz v8, :cond_7

    .line 10
    iget-boolean v8, v0, Landroidx/fragment/app/Fragment;->p:Z

    if-eqz v8, :cond_5

    .line 11
    iget v0, p0, Lc/l/d/a2;->e:I

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 12
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_7

    .line 13
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    .line 14
    :cond_5
    iget v8, p0, Lc/l/d/a2;->e:I

    if-ge v8, v5, :cond_6

    .line 15
    iget v0, v0, Landroidx/fragment/app/Fragment;->b:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    .line 16
    :cond_6
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 17
    :cond_7
    :goto_1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v0, v0, Landroidx/fragment/app/Fragment;->m:Z

    if-nez v0, :cond_8

    .line 18
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_8
    const/4 v0, 0x0

    .line 19
    sget-boolean v8, Lc/l/d/o1;->P:Z

    if-eqz v8, :cond_9

    iget-object v8, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v9, v8, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v9, :cond_9

    .line 20
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 21
    invoke-static {v9, v0}, Lc/l/d/i3;->a(Landroid/view/ViewGroup;Lc/l/d/o1;)Lc/l/d/i3;

    move-result-object v0

    .line 22
    invoke-virtual {v0, p0}, Lc/l/d/i3;->d(Lc/l/d/a2;)Lc/l/d/f3;

    move-result-object v0

    .line 23
    :cond_9
    sget-object v8, Lc/l/d/f3;->c:Lc/l/d/f3;

    if-ne v0, v8, :cond_a

    const/4 v0, 0x6

    .line 24
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_2

    .line 25
    :cond_a
    sget-object v8, Lc/l/d/f3;->d:Lc/l/d/f3;

    if-ne v0, v8, :cond_b

    .line 26
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_2

    .line 27
    :cond_b
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v4, v0, Landroidx/fragment/app/Fragment;->n:Z

    if-eqz v4, :cond_d

    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->T()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 29
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_2

    .line 30
    :cond_c
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 31
    :cond_d
    :goto_2
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v2, v0, Landroidx/fragment/app/Fragment;->J:Z

    if-eqz v2, :cond_e

    iget v0, v0, Landroidx/fragment/app/Fragment;->b:I

    if-ge v0, v3, :cond_e

    .line 32
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 33
    :cond_e
    invoke-static {v6}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "computeExpectedState() of "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    return v1
.end method

.method public e()V
    .locals 4

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->Q:Z

    if-nez v1, :cond_1

    .line 4
    iget-object v1, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v2, v0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lc/l/d/v0;->c(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    .line 5
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->h(Landroid/os/Bundle;)V

    .line 6
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Lc/l/d/v0;->b(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->k(Landroid/os/Bundle;)V

    .line 8
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x1

    iput v1, v0, Landroidx/fragment/app/Fragment;->b:I

    :goto_0
    return-void
.end method

.method public f()V
    .locals 7

    .line 1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v0, v0, Landroidx/fragment/app/Fragment;->o:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    const-string v1, "FragmentManager"

    if-eqz v0, :cond_1

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto CREATE_VIEW: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    :cond_1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->i(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v4, v3, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v4, :cond_2

    move-object v2, v4

    goto/16 :goto_1

    .line 6
    :cond_2
    iget v4, v3, Landroidx/fragment/app/Fragment;->y:I

    if-eqz v4, :cond_5

    const/4 v2, -0x1

    if-eq v4, v2, :cond_4

    .line 7
    iget-object v2, v3, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    invoke-virtual {v2}, Lc/l/d/o1;->w()Lc/l/d/n0;

    move-result-object v2

    .line 8
    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v3, v3, Landroidx/fragment/app/Fragment;->y:I

    invoke-virtual {v2, v3}, Lc/l/d/n0;->a(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    if-nez v2, :cond_5

    .line 9
    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v4, v3, Landroidx/fragment/app/Fragment;->q:Z

    if-eqz v4, :cond_3

    goto :goto_1

    .line 10
    :cond_3
    :try_start_0
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v1, v1, Landroidx/fragment/app/Fragment;->y:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "unknown"

    .line 11
    :goto_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No view found for id 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v3, v3, Landroidx/fragment/app/Fragment;->y:I

    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") for fragment "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 13
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot create fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for a container view with no id"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_5
    :goto_1
    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-object v2, v3, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    .line 15
    iget-object v4, v3, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v3, v0, v2, v4}, Landroidx/fragment/app/Fragment;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 16
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    const/4 v3, 0x2

    if-eqz v0, :cond_c

    const/4 v4, 0x0

    .line 17
    invoke-virtual {v0, v4}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 18
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v5, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    sget v6, Lc/l/b;->fragment_container_view_tag:I

    invoke-virtual {v5, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v2, :cond_6

    .line 19
    invoke-virtual {p0}, Lc/l/d/a2;->b()V

    .line 20
    :cond_6
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v2, v0, Landroidx/fragment/app/Fragment;->A:Z

    if-eqz v2, :cond_7

    .line 21
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    :cond_7
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-static {v0}, Lc/h/n/v0;->C(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 23
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-static {v0}, Lc/h/n/v0;->I(Landroid/view/View;)V

    goto :goto_2

    .line 24
    :cond_8
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 25
    new-instance v2, Lc/l/d/y1;

    invoke-direct {v2, p0, v0}, Lc/l/d/y1;-><init>(Lc/l/d/a2;Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 26
    :goto_2
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->t0()V

    .line 27
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v5, v2, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    iget-object v6, v2, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v2, v5, v6, v4}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V

    .line 28
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    .line 29
    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v2, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    .line 30
    sget-boolean v5, Lc/l/d/o1;->P:Z

    if-eqz v5, :cond_a

    .line 31
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v4, v2}, Landroidx/fragment/app/Fragment;->a(F)V

    .line 32
    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v4, v2, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v4, :cond_c

    if-nez v0, :cond_c

    .line 33
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 34
    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/Fragment;->b(Landroid/view/View;)V

    .line 35
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requestFocus: Saved focused view "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for Fragment "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    :cond_9
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_3

    .line 38
    :cond_a
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    if-nez v0, :cond_b

    iget-object v0, v1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v0, :cond_b

    const/4 v4, 0x1

    :cond_b
    iput-boolean v4, v1, Landroidx/fragment/app/Fragment;->M:Z

    .line 39
    :cond_c
    :goto_3
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput v3, v0, Landroidx/fragment/app/Fragment;->b:I

    return-void
.end method

.method public g()V
    .locals 5

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->n:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->T()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    .line 4
    iget-object v1, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    .line 5
    invoke-virtual {v1}, Lc/l/d/c2;->e()Lc/l/d/t1;

    move-result-object v1

    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v4}, Lc/l/d/t1;->f(Landroidx/fragment/app/Fragment;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v1, 0x1

    :goto_2
    if-eqz v1, :cond_b

    .line 6
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->u:Lc/l/d/r0;

    .line 7
    instance-of v4, v1, Lc/n/y;

    if-eqz v4, :cond_4

    .line 8
    iget-object v1, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    invoke-virtual {v1}, Lc/l/d/c2;->e()Lc/l/d/t1;

    move-result-object v1

    invoke-virtual {v1}, Lc/l/d/t1;->d()Z

    move-result v2

    goto :goto_3

    .line 9
    :cond_4
    invoke-virtual {v1}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v4

    instance-of v4, v4, Landroid/app/Activity;

    if-eqz v4, :cond_5

    .line 10
    invoke-virtual {v1}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 11
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    xor-int/2addr v2, v1

    :cond_5
    :goto_3
    if-nez v0, :cond_6

    if-eqz v2, :cond_7

    .line 12
    :cond_6
    iget-object v0, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->e()Lc/l/d/t1;

    move-result-object v0

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Lc/l/d/t1;->b(Landroidx/fragment/app/Fragment;)V

    .line 13
    :cond_7
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->k0()V

    .line 14
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1, v3}, Lc/l/d/v0;->b(Landroidx/fragment/app/Fragment;Z)V

    .line 15
    iget-object v0, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    invoke-virtual {v0}, Lc/l/d/c2;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/a2;

    if-eqz v1, :cond_8

    .line 16
    invoke-virtual {v1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 17
    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v2, Landroidx/fragment/app/Fragment;->g:Ljava/lang/String;

    iget-object v3, v1, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 18
    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-object v2, v1, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    const/4 v2, 0x0

    .line 19
    iput-object v2, v1, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    goto :goto_4

    .line 20
    :cond_9
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    if-eqz v1, :cond_a

    .line 21
    iget-object v2, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    invoke-virtual {v2, v1}, Lc/l/d/c2;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    .line 22
    :cond_a
    iget-object v0, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    invoke-virtual {v0, p0}, Lc/l/d/c2;->b(Lc/l/d/a2;)V

    goto :goto_5

    .line 23
    :cond_b
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    if-eqz v0, :cond_c

    .line 24
    iget-object v1, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    invoke-virtual {v1, v0}, Lc/l/d/c2;->b(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 25
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->C:Z

    if-eqz v1, :cond_c

    .line 26
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-object v0, v1, Landroidx/fragment/app/Fragment;->i:Landroidx/fragment/app/Fragment;

    .line 27
    :cond_c
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput v3, v0, Landroidx/fragment/app/Fragment;->b:I

    :goto_5
    return-void
.end method

.method public h()V
    .locals 3

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom CREATE_VIEW: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->l0()V

    .line 6
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc/l/d/v0;->i(Landroidx/fragment/app/Fragment;Z)V

    .line 7
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    .line 8
    iput-object v1, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 9
    iput-object v1, v0, Landroidx/fragment/app/Fragment;->T:Lc/l/d/y2;

    .line 10
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->U:Lc/n/p;

    invoke-virtual {v0, v1}, Lc/n/p;->a(Ljava/lang/Object;)V

    .line 11
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-boolean v2, v0, Landroidx/fragment/app/Fragment;->p:Z

    return-void
.end method

.method public i()V
    .locals 5

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "movefrom ATTACHED: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->m0()V

    .line 4
    iget-object v1, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Lc/l/d/v0;->c(Landroidx/fragment/app/Fragment;Z)V

    .line 5
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v3, -0x1

    iput v3, v1, Landroidx/fragment/app/Fragment;->b:I

    const/4 v3, 0x0

    .line 6
    iput-object v3, v1, Landroidx/fragment/app/Fragment;->u:Lc/l/d/r0;

    .line 7
    iput-object v3, v1, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/Fragment;

    .line 8
    iput-object v3, v1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    .line 9
    iget-boolean v3, v1, Landroidx/fragment/app/Fragment;->n:Z

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->T()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v4, 0x1

    :cond_1
    if-nez v4, :cond_2

    .line 10
    iget-object v1, p0, Lc/l/d/a2;->b:Lc/l/d/c2;

    invoke-virtual {v1}, Lc/l/d/c2;->e()Lc/l/d/t1;

    move-result-object v1

    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v3}, Lc/l/d/t1;->f(Landroidx/fragment/app/Fragment;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    :cond_2
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initState called for fragment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    :cond_3
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->P()V

    :cond_4
    return-void
.end method

.method public j()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->o:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->p:Z

    if-eqz v1, :cond_2

    iget-boolean v0, v0, Landroidx/fragment/app/Fragment;->r:Z

    if-nez v0, :cond_2

    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto CREATE_VIEW: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->i(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v3, v3, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/fragment/app/Fragment;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 5
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 7
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    sget v3, Lc/l/b;->fragment_container_view_tag:I

    invoke-virtual {v2, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v2, v0, Landroidx/fragment/app/Fragment;->A:Z

    if-eqz v2, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 9
    :cond_1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->t0()V

    .line 10
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v3, v2, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    iget-object v4, v2, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v2, v3, v4, v1}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V

    .line 11
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x2

    iput v1, v0, Landroidx/fragment/app/Fragment;->b:I

    :cond_2
    return-void
.end method

.method public k()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    return-object v0
.end method

.method public l()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lc/l/d/a2;->d:Z

    const-string v1, "FragmentManager"

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    .line 2
    invoke-static {v2}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ignoring re-entrant call to moveToExpectedState() for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {p0}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    const/4 v3, 0x1

    .line 6
    :try_start_0
    iput-boolean v3, p0, Lc/l/d/a2;->d:Z

    .line 7
    :goto_0
    invoke-virtual {p0}, Lc/l/d/a2;->d()I

    move-result v4

    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v5, v5, Landroidx/fragment/app/Fragment;->b:I

    if-eq v4, v5, :cond_7

    .line 8
    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v5, v5, Landroidx/fragment/app/Fragment;->b:I

    if-le v4, v5, :cond_3

    .line 9
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v4, v4, Landroidx/fragment/app/Fragment;->b:I

    add-int/2addr v4, v3

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 10
    :pswitch_0
    invoke-virtual {p0}, Lc/l/d/a2;->n()V

    goto :goto_0

    .line 11
    :pswitch_1
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v5, 0x6

    iput v5, v4, Landroidx/fragment/app/Fragment;->b:I

    goto :goto_0

    .line 12
    :pswitch_2
    invoke-virtual {p0}, Lc/l/d/a2;->s()V

    goto :goto_0

    .line 13
    :pswitch_3
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v4, v4, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v4, :cond_2

    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v4, v4, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v4, :cond_2

    .line 14
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v4, v4, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    .line 15
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v5

    .line 16
    invoke-static {v4, v5}, Lc/l/d/i3;->a(Landroid/view/ViewGroup;Lc/l/d/o1;)Lc/l/d/i3;

    move-result-object v4

    .line 17
    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v5, v5, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    .line 18
    invoke-static {v5}, Lc/l/d/g3;->a(I)Lc/l/d/g3;

    move-result-object v5

    .line 19
    invoke-virtual {v4, v5, p0}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/a2;)V

    .line 20
    :cond_2
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v5, 0x4

    iput v5, v4, Landroidx/fragment/app/Fragment;->b:I

    goto :goto_0

    .line 21
    :pswitch_4
    invoke-virtual {p0}, Lc/l/d/a2;->a()V

    goto :goto_0

    .line 22
    :pswitch_5
    invoke-virtual {p0}, Lc/l/d/a2;->j()V

    .line 23
    invoke-virtual {p0}, Lc/l/d/a2;->f()V

    goto :goto_0

    .line 24
    :pswitch_6
    invoke-virtual {p0}, Lc/l/d/a2;->e()V

    goto :goto_0

    .line 25
    :pswitch_7
    invoke-virtual {p0}, Lc/l/d/a2;->c()V

    goto :goto_0

    .line 26
    :cond_3
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v4, v4, Landroidx/fragment/app/Fragment;->b:I

    sub-int/2addr v4, v3

    packed-switch v4, :pswitch_data_1

    goto :goto_0

    .line 27
    :pswitch_8
    invoke-virtual {p0}, Lc/l/d/a2;->m()V

    goto :goto_0

    .line 28
    :pswitch_9
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v5, 0x5

    iput v5, v4, Landroidx/fragment/app/Fragment;->b:I

    goto :goto_0

    .line 29
    :pswitch_a
    invoke-virtual {p0}, Lc/l/d/a2;->t()V

    goto :goto_0

    :pswitch_b
    const/4 v4, 0x3

    .line 30
    invoke-static {v4}, Lc/l/d/o1;->d(I)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 31
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "movefrom ACTIVITY_CREATED: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    :cond_4
    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v5, v5, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v5, :cond_5

    .line 33
    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v5, v5, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    if-nez v5, :cond_5

    .line 34
    invoke-virtual {p0}, Lc/l/d/a2;->r()V

    .line 35
    :cond_5
    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v5, v5, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v5, :cond_6

    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v5, v5, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v5, :cond_6

    .line 36
    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v5, v5, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    iget-object v6, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    .line 37
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v6

    .line 38
    invoke-static {v5, v6}, Lc/l/d/i3;->a(Landroid/view/ViewGroup;Lc/l/d/o1;)Lc/l/d/i3;

    move-result-object v5

    .line 39
    invoke-virtual {v5, p0}, Lc/l/d/i3;->b(Lc/l/d/a2;)V

    .line 40
    :cond_6
    iget-object v5, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput v4, v5, Landroidx/fragment/app/Fragment;->b:I

    goto/16 :goto_0

    .line 41
    :pswitch_c
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-boolean v0, v4, Landroidx/fragment/app/Fragment;->p:Z

    .line 42
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput v2, v4, Landroidx/fragment/app/Fragment;->b:I

    goto/16 :goto_0

    .line 43
    :pswitch_d
    invoke-virtual {p0}, Lc/l/d/a2;->h()V

    .line 44
    iget-object v4, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput v3, v4, Landroidx/fragment/app/Fragment;->b:I

    goto/16 :goto_0

    .line 45
    :pswitch_e
    invoke-virtual {p0}, Lc/l/d/a2;->g()V

    goto/16 :goto_0

    .line 46
    :pswitch_f
    invoke-virtual {p0}, Lc/l/d/a2;->i()V

    goto/16 :goto_0

    .line 47
    :cond_7
    sget-boolean v1, Lc/l/d/o1;->P:Z

    if-eqz v1, :cond_b

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v1, v1, Landroidx/fragment/app/Fragment;->N:Z

    if-eqz v1, :cond_b

    .line 48
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    if-eqz v1, :cond_9

    .line 49
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    .line 50
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v2

    .line 51
    invoke-static {v1, v2}, Lc/l/d/i3;->a(Landroid/view/ViewGroup;Lc/l/d/o1;)Lc/l/d/i3;

    move-result-object v1

    .line 52
    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v2, v2, Landroidx/fragment/app/Fragment;->A:Z

    if-eqz v2, :cond_8

    .line 53
    invoke-virtual {v1, p0}, Lc/l/d/i3;->a(Lc/l/d/a2;)V

    goto :goto_1

    .line 54
    :cond_8
    invoke-virtual {v1, p0}, Lc/l/d/i3;->c(Lc/l/d/a2;)V

    .line 55
    :cond_9
    :goto_1
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    if-eqz v1, :cond_a

    .line 56
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->t:Lc/l/d/o1;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v2}, Lc/l/d/o1;->n(Landroidx/fragment/app/Fragment;)V

    .line 57
    :cond_a
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-boolean v0, v1, Landroidx/fragment/app/Fragment;->N:Z

    .line 58
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v2, v2, Landroidx/fragment/app/Fragment;->A:Z

    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :cond_b
    iput-boolean v0, p0, Lc/l/d/a2;->d:Z

    return-void

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Lc/l/d/a2;->d:Z

    .line 60
    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public m()V
    .locals 3

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom RESUMED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()V

    .line 4
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc/l/d/v0;->d(Landroidx/fragment/app/Fragment;Z)V

    return-void
.end method

.method public n()V
    .locals 5

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    const-string v1, "FragmentManager"

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto RESUMED: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->t()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p0, v0}, Lc/l/d/a2;->a(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v2

    const/4 v3, 0x2

    .line 6
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requestFocus: Restoring focused view "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_1

    const-string v0, "succeeded"

    goto :goto_0

    :cond_1
    const-string v0, "failed"

    .line 8
    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " on Fragment "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " resulting in focused view "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    :cond_2
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->b(Landroid/view/View;)V

    .line 12
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->q0()V

    .line 13
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Lc/l/d/v0;->f(Landroidx/fragment/app/Fragment;Z)V

    .line 14
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-object v1, v0, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    .line 15
    iput-object v1, v0, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    .line 16
    iput-object v1, v0, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    return-void
.end method

.method public final o()Landroid/os/Bundle;
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->j(Landroid/os/Bundle;)V

    .line 3
    iget-object v1, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lc/l/d/v0;->d(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    .line 4
    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 5
    :cond_0
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p0}, Lc/l/d/a2;->r()V

    .line 7
    :cond_1
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    if-eqz v1, :cond_3

    if-nez v0, :cond_2

    .line 8
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    :cond_2
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    const-string v2, "android:view_state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 10
    :cond_3
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    if-eqz v1, :cond_5

    if-nez v0, :cond_4

    .line 11
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    :cond_4
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    const-string v2, "android:view_registry_state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 13
    :cond_5
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v1, v1, Landroidx/fragment/app/Fragment;->K:Z

    if-nez v1, :cond_7

    if-nez v0, :cond_6

    .line 14
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 15
    :cond_6
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v1, v1, Landroidx/fragment/app/Fragment;->K:Z

    const-string v2, "android:user_visible_hint"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_7
    return-object v0
.end method

.method public p()Lc/l/d/b0;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v0, v0, Landroidx/fragment/app/Fragment;->b:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-le v0, v2, :cond_0

    .line 2
    invoke-virtual {p0}, Lc/l/d/a2;->o()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Lc/l/d/b0;

    invoke-direct {v1, v0}, Lc/l/d/b0;-><init>(Landroid/os/Bundle;)V

    :cond_0
    return-object v1
.end method

.method public q()Lc/l/d/x1;
    .locals 4

    .line 1
    new-instance v0, Lc/l/d/x1;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-direct {v0, v1}, Lc/l/d/x1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 2
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v1, v1, Landroidx/fragment/app/Fragment;->b:I

    const/4 v2, -0x1

    if-le v1, v2, :cond_1

    iget-object v1, v0, Lc/l/d/x1;->n:Landroid/os/Bundle;

    if-nez v1, :cond_1

    .line 3
    invoke-virtual {p0}, Lc/l/d/a2;->o()Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, v0, Lc/l/d/x1;->n:Landroid/os/Bundle;

    .line 4
    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v2, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    if-eqz v2, :cond_2

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, v0, Lc/l/d/x1;->n:Landroid/os/Bundle;

    .line 6
    :cond_0
    iget-object v1, v0, Lc/l/d/x1;->n:Landroid/os/Bundle;

    iget-object v2, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v2, v2, Landroidx/fragment/app/Fragment;->j:Ljava/lang/String;

    const-string v3, "android:target_state"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget v1, v1, Landroidx/fragment/app/Fragment;->k:I

    if-eqz v1, :cond_2

    .line 8
    iget-object v2, v0, Lc/l/d/x1;->n:Landroid/os/Bundle;

    const-string v3, "android:target_req_state"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->c:Landroid/os/Bundle;

    iput-object v1, v0, Lc/l/d/x1;->n:Landroid/os/Bundle;

    :cond_2
    :goto_0
    return-object v0
.end method

.method public r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 3
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 4
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 5
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-object v0, v1, Landroidx/fragment/app/Fragment;->d:Landroid/util/SparseArray;

    .line 6
    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 7
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->T:Lc/l/d/y2;

    invoke-virtual {v1, v0}, Lc/l/d/y2;->b(Landroid/os/Bundle;)V

    .line 8
    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 9
    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    iput-object v0, v1, Landroidx/fragment/app/Fragment;->e:Landroid/os/Bundle;

    :cond_2
    return-void
.end method

.method public s()V
    .locals 3

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto STARTED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->r0()V

    .line 4
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc/l/d/v0;->g(Landroidx/fragment/app/Fragment;Z)V

    return-void
.end method

.method public t()V
    .locals 3

    const/4 v0, 0x3

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom STARTED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->s0()V

    .line 4
    iget-object v0, p0, Lc/l/d/a2;->a:Lc/l/d/v0;

    iget-object v1, p0, Lc/l/d/a2;->c:Landroidx/fragment/app/Fragment;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lc/l/d/v0;->h(Landroidx/fragment/app/Fragment;Z)V

    return-void
.end method
