.class public abstract Lc/l/d/b2;
.super Lc/y/a/a;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:Lc/l/d/o1;

.field public final b:I

.field public c:Lc/l/d/e2;

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/l/d/b0;",
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

.field public f:Landroidx/fragment/app/Fragment;

.field public g:Z


# direct methods
.method public constructor <init>(Lc/l/d/o1;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/y/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    .line 5
    iput-object v0, p0, Lc/l/d/b2;->f:Landroidx/fragment/app/Fragment;

    .line 6
    iput-object p1, p0, Lc/l/d/b2;->a:Lc/l/d/o1;

    .line 7
    iput p2, p0, Lc/l/d/b2;->b:I

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, p2, :cond_0

    .line 2
    iget-object v0, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lc/l/d/b2;->a:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->b()Lc/l/d/e2;

    move-result-object v0

    iput-object v0, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    .line 5
    :cond_1
    invoke-virtual {p0, p2}, Lc/l/d/b2;->b(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, p2, :cond_2

    .line 7
    iget-object v1, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/b0;

    if-eqz v1, :cond_2

    .line 8
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->a(Lc/l/d/b0;)V

    .line 9
    :cond_2
    :goto_0
    iget-object v1, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, p2, :cond_3

    .line 10
    iget-object v1, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->i(Z)V

    .line 12
    iget v2, p0, Lc/l/d/b2;->b:I

    if-nez v2, :cond_4

    .line 13
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->k(Z)V

    .line 14
    :cond_4
    iget-object v1, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 15
    iget-object p2, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    invoke-virtual {p2, p1, v0}, Lc/l/d/e2;->a(ILandroidx/fragment/app/Fragment;)Lc/l/d/e2;

    .line 16
    iget p1, p0, Lc/l/d/b2;->b:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_5

    .line 17
    iget-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    sget-object p2, Lc/n/g$b;->e:Lc/n/g$b;

    invoke-virtual {p1, v0, p2}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)Lc/l/d/e2;

    :cond_5
    return-object v0
.end method

.method public a(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 5

    if-eqz p1, :cond_4

    .line 38
    check-cast p1, Landroid/os/Bundle;

    .line 39
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string p2, "states"

    .line 40
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p2

    .line 41
    iget-object v0, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 42
    iget-object v0, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    .line 43
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_0

    .line 44
    iget-object v2, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    aget-object v3, p2, v1

    check-cast v3, Lc/l/d/b0;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p2

    .line 46
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "f"

    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 49
    iget-object v3, p0, Lc/l/d/b2;->a:Lc/l/d/o1;

    invoke-virtual {v3, p1, v1}, Lc/l/d/o1;->a(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 50
    :goto_2
    iget-object v1, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v2, :cond_2

    .line 51
    iget-object v1, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->i(Z)V

    .line 53
    iget-object v1, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 54
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bad fragment at key "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentStatePagerAdapt"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_4
    return-void
.end method

.method public a(Landroid/view/ViewGroup;)V
    .locals 2

    .line 30
    iget-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    if-eqz p1, :cond_1

    .line 31
    iget-boolean v0, p0, Lc/l/d/b2;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 32
    :try_start_0
    iput-boolean v0, p0, Lc/l/d/b2;->g:Z

    .line 33
    invoke-virtual {p1}, Lc/l/d/e2;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iput-boolean v1, p0, Lc/l/d/b2;->g:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Lc/l/d/b2;->g:Z

    .line 35
    throw p1

    :cond_0
    :goto_0
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    :cond_1
    return-void
.end method

.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    .line 18
    check-cast p3, Landroidx/fragment/app/Fragment;

    .line 19
    iget-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    if-nez p1, :cond_0

    .line 20
    iget-object p1, p0, Lc/l/d/b2;->a:Lc/l/d/o1;

    invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;

    move-result-object p1

    iput-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    .line 21
    :cond_0
    :goto_0
    iget-object p1, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    if-gt p1, p2, :cond_1

    .line 22
    iget-object p1, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_1
    iget-object p1, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->Q()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 24
    iget-object v1, p0, Lc/l/d/b2;->a:Lc/l/d/o1;

    invoke-virtual {v1, p3}, Lc/l/d/o1;->u(Landroidx/fragment/app/Fragment;)Lc/l/d/b0;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v0

    .line 25
    :goto_1
    invoke-virtual {p1, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 26
    iget-object p1, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, p2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 27
    iget-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    invoke-virtual {p1, p3}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/e2;

    .line 28
    iget-object p1, p0, Lc/l/d/b2;->f:Landroidx/fragment/app/Fragment;

    invoke-virtual {p3, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 29
    iput-object v0, p0, Lc/l/d/b2;->f:Landroidx/fragment/app/Fragment;

    :cond_3
    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 37
    check-cast p2, Landroidx/fragment/app/Fragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;

    move-result-object p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()Landroid/os/Parcelable;
    .locals 5

    .line 18
    iget-object v0, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 19
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 20
    iget-object v1, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Lc/l/d/b0;

    .line 21
    iget-object v2, p0, Lc/l/d/b2;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    const-string v2, "states"

    .line 22
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    .line 23
    :goto_1
    iget-object v2, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 24
    iget-object v2, p0, Lc/l/d/b2;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_2

    .line 25
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->Q()Z

    move-result v3

    if-eqz v3, :cond_2

    if-nez v0, :cond_1

    .line 26
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 27
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "f"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 28
    iget-object v4, p0, Lc/l/d/b2;->a:Lc/l/d/o1;

    invoke-virtual {v4, v0, v3, v2}, Lc/l/d/o1;->a(Landroid/os/Bundle;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public abstract b(I)Landroidx/fragment/app/Fragment;
.end method

.method public b(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ViewPager with adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " requires a view id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2

    .line 3
    check-cast p3, Landroidx/fragment/app/Fragment;

    .line 4
    iget-object p1, p0, Lc/l/d/b2;->f:Landroidx/fragment/app/Fragment;

    if-eq p3, p1, :cond_5

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->i(Z)V

    .line 6
    iget p1, p0, Lc/l/d/b2;->b:I

    if-ne p1, p2, :cond_1

    .line 7
    iget-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    if-nez p1, :cond_0

    .line 8
    iget-object p1, p0, Lc/l/d/b2;->a:Lc/l/d/o1;

    invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;

    move-result-object p1

    iput-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    .line 9
    :cond_0
    iget-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    iget-object v0, p0, Lc/l/d/b2;->f:Landroidx/fragment/app/Fragment;

    sget-object v1, Lc/n/g$b;->e:Lc/n/g$b;

    invoke-virtual {p1, v0, v1}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)Lc/l/d/e2;

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lc/l/d/b2;->f:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->k(Z)V

    .line 11
    :cond_2
    :goto_0
    invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->i(Z)V

    .line 12
    iget p1, p0, Lc/l/d/b2;->b:I

    if-ne p1, p2, :cond_4

    .line 13
    iget-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    if-nez p1, :cond_3

    .line 14
    iget-object p1, p0, Lc/l/d/b2;->a:Lc/l/d/o1;

    invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;

    move-result-object p1

    iput-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    .line 15
    :cond_3
    iget-object p1, p0, Lc/l/d/b2;->c:Lc/l/d/e2;

    sget-object p2, Lc/n/g$b;->f:Lc/n/g$b;

    invoke-virtual {p1, p3, p2}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Lc/n/g$b;)Lc/l/d/e2;

    goto :goto_1

    .line 16
    :cond_4
    invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->k(Z)V

    .line 17
    :goto_1
    iput-object p3, p0, Lc/l/d/b2;->f:Landroidx/fragment/app/Fragment;

    :cond_5
    return-void
.end method
