.class public Le/b/a/z/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/b/a/z/v$a;
    }
.end annotation


# static fields
.field public static final k:Le/b/a/z/v$a;


# instance fields
.field public volatile a:Le/b/a/u;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/app/FragmentManager;",
            "Le/b/a/z/t;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lc/l/d/o1;",
            "Le/b/a/z/l0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Landroid/os/Handler;

.field public final e:Le/b/a/z/v$a;

.field public final f:Lc/e/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/b<",
            "Landroid/view/View;",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lc/e/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/b<",
            "Landroid/view/View;",
            "Landroid/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Landroid/os/Bundle;

.field public final i:Le/b/a/z/l;

.field public final j:Le/b/a/z/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/z/u;

    invoke-direct {v0}, Le/b/a/z/u;-><init>()V

    sput-object v0, Le/b/a/z/v;->k:Le/b/a/z/v$a;

    return-void
.end method

.method public constructor <init>(Le/b/a/z/v$a;Le/b/a/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/b/a/z/v;->b:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/b/a/z/v;->c:Ljava/util/Map;

    .line 4
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    iput-object v0, p0, Le/b/a/z/v;->f:Lc/e/b;

    .line 5
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    iput-object v0, p0, Le/b/a/z/v;->g:Lc/e/b;

    .line 6
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Le/b/a/z/v;->h:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Le/b/a/z/v;->k:Le/b/a/z/v$a;

    :goto_0
    iput-object p1, p0, Le/b/a/z/v;->e:Le/b/a/z/v$a;

    .line 8
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Le/b/a/z/v;->d:Landroid/os/Handler;

    .line 9
    new-instance p1, Le/b/a/z/q;

    iget-object v0, p0, Le/b/a/z/v;->e:Le/b/a/z/v$a;

    invoke-direct {p1, v0}, Le/b/a/z/q;-><init>(Le/b/a/z/v$a;)V

    iput-object p1, p0, Le/b/a/z/v;->j:Le/b/a/z/q;

    .line 10
    invoke-static {p2}, Le/b/a/z/v;->a(Le/b/a/l;)Le/b/a/z/l;

    move-result-object p1

    iput-object p1, p0, Le/b/a/z/v;->i:Le/b/a/z/l;

    return-void
.end method

.method public static a(Le/b/a/l;)Le/b/a/z/l;
    .locals 1

    .line 1
    sget-boolean v0, Le/b/a/y/z/e/d0;->h:Z

    if-eqz v0, :cond_2

    sget-boolean v0, Le/b/a/y/z/e/d0;->g:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    const-class v0, Le/b/a/h;

    invoke-virtual {p0, v0}, Le/b/a/l;->a(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 3
    new-instance p0, Le/b/a/z/j;

    invoke-direct {p0}, Le/b/a/z/j;-><init>()V

    goto :goto_0

    .line 4
    :cond_1
    new-instance p0, Le/b/a/z/k;

    invoke-direct {p0}, Le/b/a/z/k;-><init>()V

    :goto_0
    return-object p0

    .line 5
    :cond_2
    :goto_1
    new-instance p0, Le/b/a/z/h;

    invoke-direct {p0}, Le/b/a/z/h;-><init>()V

    return-object p0
.end method

.method public static a(Ljava/util/Collection;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    .line 59
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1

    .line 60
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 61
    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;

    move-result-object v0

    invoke-virtual {v0}, Lc/l/d/o1;->z()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Le/b/a/z/v;->a(Ljava/util/Collection;Ljava/util/Map;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static c(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 2
    check-cast p0, Landroid/app/Activity;

    return-object p0

    .line 3
    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 4
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Le/b/a/z/v;->c(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Landroid/app/Activity;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load for a destroyed activity"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Le/b/a/z/v;->c(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_0

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


# virtual methods
.method public final a(Landroid/view/View;Landroid/app/Activity;)Landroid/app/Fragment;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 72
    iget-object v0, p0, Le/b/a/z/v;->g:Lc/e/b;

    invoke-virtual {v0}, Lc/e/i;->clear()V

    .line 73
    invoke-virtual {p2}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, Le/b/a/z/v;->g:Lc/e/b;

    invoke-virtual {p0, v0, v1}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Lc/e/b;)V

    const v0, 0x1020002

    .line 74
    invoke-virtual {p2, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/4 v0, 0x0

    .line 75
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 76
    iget-object v0, p0, Le/b/a/z/v;->g:Lc/e/b;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Fragment;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_1

    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    goto :goto_0

    .line 79
    :cond_1
    :goto_1
    iget-object p1, p0, Le/b/a/z/v;->g:Lc/e/b;

    invoke-virtual {p1}, Lc/e/i;->clear()V

    return-object v0
.end method

.method public final a(Landroid/view/View;Lc/l/d/f0;)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 63
    iget-object v0, p0, Le/b/a/z/v;->f:Lc/e/b;

    invoke-virtual {v0}, Lc/e/i;->clear()V

    .line 64
    invoke-virtual {p2}, Lc/l/d/f0;->j()Lc/l/d/o1;

    move-result-object v0

    invoke-virtual {v0}, Lc/l/d/o1;->z()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Le/b/a/z/v;->f:Lc/e/b;

    .line 65
    invoke-static {v0, v1}, Le/b/a/z/v;->a(Ljava/util/Collection;Ljava/util/Map;)V

    const v0, 0x1020002

    .line 66
    invoke-virtual {p2, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/4 v0, 0x0

    .line 67
    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 68
    iget-object v0, p0, Le/b/a/z/v;->f:Lc/e/b;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 69
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_1

    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    goto :goto_0

    .line 71
    :cond_1
    :goto_1
    iget-object p1, p0, Le/b/a/z/v;->f:Lc/e/b;

    invoke-virtual {p1}, Lc/e/i;->clear()V

    return-object v0
.end method

.method public a(Landroid/app/Activity;)Le/b/a/u;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 38
    invoke-static {}, Le/b/a/e0/t;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 40
    :cond_0
    instance-of v0, p1, Lc/l/d/f0;

    if-eqz v0, :cond_1

    .line 41
    check-cast p1, Lc/l/d/f0;

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Lc/l/d/f0;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 42
    :cond_1
    invoke-static {p1}, Le/b/a/z/v;->c(Landroid/app/Activity;)V

    .line 43
    iget-object v0, p0, Le/b/a/z/v;->i:Le/b/a/z/l;

    invoke-interface {v0, p1}, Le/b/a/z/l;->a(Landroid/app/Activity;)V

    .line 44
    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const/4 v1, 0x0

    .line 45
    invoke-static {p1}, Le/b/a/z/v;->d(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Le/b/a/z/v;->a(Landroid/content/Context;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Le/b/a/u;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/app/Fragment;)Le/b/a/u;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 86
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 87
    invoke-static {}, Le/b/a/e0/t;->d()Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 89
    iget-object v0, p0, Le/b/a/z/v;->i:Le/b/a/z/l;

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {v0, v1}, Le/b/a/z/l;->a(Landroid/app/Activity;)V

    .line 90
    :cond_1
    invoke-virtual {p1}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    .line 91
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p1}, Landroid/app/Fragment;->isVisible()Z

    move-result v2

    invoke-virtual {p0, v1, v0, p1, v2}, Le/b/a/z/v;->a(Landroid/content/Context;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 92
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a fragment before it is attached"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Landroid/content/Context;)Le/b/a/u;
    .locals 2

    if-eqz p1, :cond_3

    .line 6
    invoke-static {}, Le/b/a/e0/t;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, Landroid/app/Application;

    if-nez v0, :cond_2

    .line 7
    instance-of v0, p1, Lc/l/d/f0;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lc/l/d/f0;

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Lc/l/d/f0;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 10
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/app/Activity;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 11
    :cond_1
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/content/ContextWrapper;

    .line 12
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 14
    :cond_2
    invoke-virtual {p0, p1}, Le/b/a/z/v;->b(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 15
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a null Context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Landroid/content/Context;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Le/b/a/u;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 101
    invoke-virtual {p0, p2, p3}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Landroid/app/Fragment;)Le/b/a/z/t;

    move-result-object p2

    .line 102
    invoke-virtual {p2}, Le/b/a/z/t;->d()Le/b/a/u;

    move-result-object p3

    if-nez p3, :cond_1

    .line 103
    invoke-static {p1}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object p3

    .line 104
    iget-object v0, p0, Le/b/a/z/v;->e:Le/b/a/z/v$a;

    .line 105
    invoke-virtual {p2}, Le/b/a/z/t;->b()Le/b/a/z/a;

    move-result-object v1

    invoke-virtual {p2}, Le/b/a/z/t;->e()Le/b/a/z/w;

    move-result-object v2

    .line 106
    invoke-interface {v0, p3, v1, v2, p1}, Le/b/a/z/v$a;->a(Le/b/a/d;Le/b/a/z/m;Le/b/a/z/w;Landroid/content/Context;)Le/b/a/u;

    move-result-object p3

    if-eqz p4, :cond_0

    .line 107
    invoke-virtual {p3}, Le/b/a/u;->a()V

    .line 108
    :cond_0
    invoke-virtual {p2, p3}, Le/b/a/z/t;->a(Le/b/a/u;)V

    :cond_1
    return-object p3
.end method

.method public a(Landroid/view/View;)Le/b/a/u;
    .locals 2

    .line 46
    invoke-static {}, Le/b/a/e0/t;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 48
    :cond_0
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Unable to obtain a request manager for a view without a Context"

    .line 50
    invoke-static {v0, v1}, Le/b/a/e0/r;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/b/a/z/v;->c(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 53
    :cond_1
    instance-of v1, v0, Lc/l/d/f0;

    if-eqz v1, :cond_3

    .line 54
    check-cast v0, Lc/l/d/f0;

    invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Landroid/view/View;Lc/l/d/f0;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 55
    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroidx/fragment/app/Fragment;)Le/b/a/u;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Le/b/a/z/v;->a(Lc/l/d/f0;)Le/b/a/u;

    move-result-object p1

    :goto_0
    return-object p1

    .line 56
    :cond_3
    invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Landroid/view/View;Landroid/app/Activity;)Landroid/app/Fragment;

    move-result-object p1

    if-nez p1, :cond_4

    .line 57
    invoke-virtual {p0, v0}, Le/b/a/z/v;->a(Landroid/app/Activity;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 58
    :cond_4
    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/app/Fragment;)Le/b/a/u;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroidx/fragment/app/Fragment;)Le/b/a/u;
    .locals 8

    .line 26
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;

    move-result-object v0

    const-string v1, "You cannot start a load on a fragment before it is attached or after it is destroyed"

    .line 27
    invoke-static {v0, v1}, Le/b/a/e0/r;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    invoke-static {}, Le/b/a/e0/t;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 30
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->e()Lc/l/d/f0;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 31
    iget-object v0, p0, Le/b/a/z/v;->i:Le/b/a/z/l;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->e()Lc/l/d/f0;

    move-result-object v1

    invoke-interface {v0, v1}, Le/b/a/z/l;->a(Landroid/app/Activity;)V

    .line 32
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;

    move-result-object v6

    .line 33
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->m()Landroid/content/Context;

    move-result-object v3

    .line 34
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object v4

    .line 35
    iget-object v2, p0, Le/b/a/z/v;->j:Le/b/a/z/q;

    .line 36
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->g()Lc/n/g;

    move-result-object v5

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->Z()Z

    move-result v7

    .line 37
    invoke-virtual/range {v2 .. v7}, Le/b/a/z/q;->a(Landroid/content/Context;Le/b/a/d;Lc/n/g;Lc/l/d/o1;Z)Le/b/a/u;

    move-result-object p1

    return-object p1
.end method

.method public a(Lc/l/d/f0;)Le/b/a/u;
    .locals 7

    .line 16
    invoke-static {}, Le/b/a/e0/t;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/z/v;->a(Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    return-object p1

    .line 18
    :cond_0
    invoke-static {p1}, Le/b/a/z/v;->c(Landroid/app/Activity;)V

    .line 19
    iget-object v0, p0, Le/b/a/z/v;->i:Le/b/a/z/l;

    invoke-interface {v0, p1}, Le/b/a/z/l;->a(Landroid/app/Activity;)V

    .line 20
    invoke-static {p1}, Le/b/a/z/v;->d(Landroid/content/Context;)Z

    move-result v6

    .line 21
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object v3

    .line 22
    iget-object v1, p0, Le/b/a/z/v;->j:Le/b/a/z/q;

    .line 23
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->g()Lc/n/g;

    move-result-object v4

    .line 24
    invoke-virtual {p1}, Lc/l/d/f0;->j()Lc/l/d/o1;

    move-result-object v5

    move-object v2, p1

    .line 25
    invoke-virtual/range {v1 .. v6}, Le/b/a/z/q;->a(Landroid/content/Context;Le/b/a/d;Lc/n/g;Lc/l/d/o1;Z)Le/b/a/u;

    move-result-object p1

    return-object p1
.end method

.method public a(Lc/l/d/o1;)Le/b/a/z/l0;
    .locals 1

    const/4 v0, 0x0

    .line 109
    invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)Le/b/a/z/l0;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)Le/b/a/z/l0;
    .locals 2

    .line 110
    iget-object v0, p0, Le/b/a/z/v;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/z/l0;

    if-nez v0, :cond_1

    const-string v0, "com.bumptech.glide.manager"

    .line 111
    invoke-virtual {p1, v0}, Lc/l/d/o1;->c(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    check-cast v1, Le/b/a/z/l0;

    if-nez v1, :cond_0

    .line 112
    new-instance v1, Le/b/a/z/l0;

    invoke-direct {v1}, Le/b/a/z/l0;-><init>()V

    .line 113
    invoke-virtual {v1, p2}, Le/b/a/z/l0;->c(Landroidx/fragment/app/Fragment;)V

    .line 114
    iget-object p2, p0, Le/b/a/z/v;->c:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;

    move-result-object p2

    invoke-virtual {p2, v1, v0}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lc/l/d/e2;

    invoke-virtual {p2}, Lc/l/d/e2;->b()I

    .line 116
    iget-object p2, p0, Le/b/a/z/v;->d:Landroid/os/Handler;

    const/4 v0, 0x2

    invoke-virtual {p2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public final a(Landroid/app/FragmentManager;Landroid/app/Fragment;)Le/b/a/z/t;
    .locals 2

    .line 94
    iget-object v0, p0, Le/b/a/z/v;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/z/t;

    if-nez v0, :cond_1

    const-string v0, "com.bumptech.glide.manager"

    .line 95
    invoke-virtual {p1, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    check-cast v1, Le/b/a/z/t;

    if-nez v1, :cond_0

    .line 96
    new-instance v1, Le/b/a/z/t;

    invoke-direct {v1}, Le/b/a/z/t;-><init>()V

    .line 97
    invoke-virtual {v1, p2}, Le/b/a/z/t;->b(Landroid/app/Fragment;)V

    .line 98
    iget-object p2, p0, Le/b/a/z/v;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p2

    invoke-virtual {p2, v1, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 100
    iget-object p2, p0, Le/b/a/z/v;->d:Landroid/os/Handler;

    const/4 v0, 0x1

    invoke-virtual {p2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_0
    move-object v0, v1

    :cond_1
    return-object v0
.end method

.method public final a(Landroid/app/FragmentManager;Lc/e/b;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/FragmentManager;",
            "Lc/e/b<",
            "Landroid/view/View;",
            "Landroid/app/Fragment;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 80
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 81
    invoke-virtual {p1}, Landroid/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Fragment;

    .line 82
    invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 83
    invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    invoke-virtual {v0}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Lc/e/b;)V

    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {p0, p1, p2}, Le/b/a/z/v;->b(Landroid/app/FragmentManager;Lc/e/b;)V

    :cond_2
    return-void
.end method

.method public final a(Landroid/app/FragmentManager;Z)Z
    .locals 5

    .line 117
    iget-object v0, p0, Le/b/a/z/v;->b:Ljava/util/Map;

    .line 118
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/z/t;

    const-string v1, "com.bumptech.glide.manager"

    .line 119
    invoke-virtual {p1, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v2

    check-cast v2, Le/b/a/z/t;

    const/4 v3, 0x1

    if-ne v2, v0, :cond_0

    return v3

    :cond_0
    if-eqz v2, :cond_2

    .line 120
    invoke-virtual {v2}, Le/b/a/z/t;->d()Le/b/a/u;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 121
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "We\'ve added two fragments with requests! Old: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " New: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const-string v4, "RMRetriever"

    if-nez p2, :cond_6

    .line 122
    invoke-virtual {p1}, Landroid/app/FragmentManager;->isDestroyed()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    .line 123
    :cond_3
    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p2

    invoke-virtual {p2, v0, v1}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object p2

    if-eqz v2, :cond_4

    .line 124
    invoke-virtual {p2, v2}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 125
    :cond_4
    invoke-virtual {p2}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 126
    iget-object p2, p0, Le/b/a/z/v;->d:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 127
    invoke-virtual {p2, v3, v3, v0, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 128
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    const/4 p1, 0x3

    .line 129
    invoke-static {v4, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "We failed to add our Fragment the first time around, trying again..."

    .line 130
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    return v0

    :cond_6
    :goto_1
    const/4 p2, 0x5

    .line 131
    invoke-static {v4, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 132
    invoke-virtual {p1}, Landroid/app/FragmentManager;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p1, "Parent was destroyed before our Fragment could be added"

    .line 133
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_7
    const-string p1, "Tried adding Fragment twice and failed twice, giving up!"

    .line 134
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    :cond_8
    :goto_2
    invoke-virtual {v0}, Le/b/a/z/t;->b()Le/b/a/z/a;

    move-result-object p1

    invoke-virtual {p1}, Le/b/a/z/a;->a()V

    return v3
.end method

.method public final a(Lc/l/d/o1;Z)Z
    .locals 5

    .line 136
    iget-object v0, p0, Le/b/a/z/v;->c:Ljava/util/Map;

    .line 137
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/z/l0;

    const-string v1, "com.bumptech.glide.manager"

    .line 138
    invoke-virtual {p1, v1}, Lc/l/d/o1;->c(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v2

    check-cast v2, Le/b/a/z/l0;

    const/4 v3, 0x1

    if-ne v2, v0, :cond_0

    return v3

    :cond_0
    if-eqz v2, :cond_2

    .line 139
    invoke-virtual {v2}, Le/b/a/z/l0;->C0()Le/b/a/u;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 140
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "We\'ve added two fragments with requests! Old: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " New: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const-string v4, "RMRetriever"

    if-nez p2, :cond_6

    .line 141
    invoke-virtual {p1}, Lc/l/d/o1;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    .line 142
    :cond_3
    invoke-virtual {p1}, Lc/l/d/o1;->b()Lc/l/d/e2;

    move-result-object p2

    invoke-virtual {p2, v0, v1}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lc/l/d/e2;

    if-eqz v2, :cond_4

    .line 143
    invoke-virtual {p2, v2}, Lc/l/d/e2;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/e2;

    .line 144
    :cond_4
    invoke-virtual {p2}, Lc/l/d/e2;->c()V

    .line 145
    iget-object p2, p0, Le/b/a/z/v;->d:Landroid/os/Handler;

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 146
    invoke-virtual {p2, v0, v3, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 147
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    const/4 p1, 0x3

    .line 148
    invoke-static {v4, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "We failed to add our Fragment the first time around, trying again..."

    .line 149
    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    return v1

    .line 150
    :cond_6
    :goto_1
    invoke-virtual {p1}, Lc/l/d/o1;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 p1, 0x5

    .line 151
    invoke-static {v4, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled"

    .line 152
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_7
    const/4 p1, 0x6

    .line 153
    invoke-static {v4, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you\'re starting loads in a unit test with an Activity that you haven\'t created and never create. If you\'re using Robolectric, create the Activity as part of your test setup"

    .line 154
    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    :cond_8
    :goto_2
    invoke-virtual {v0}, Le/b/a/z/l0;->A0()Le/b/a/z/a;

    move-result-object p1

    invoke-virtual {p1}, Le/b/a/z/a;->a()V

    return v3
.end method

.method public final b(Landroid/content/Context;)Le/b/a/u;
    .locals 4

    .line 1
    iget-object v0, p0, Le/b/a/z/v;->a:Le/b/a/u;

    if-nez v0, :cond_1

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Le/b/a/z/v;->a:Le/b/a/u;

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/b/a/d;->a(Landroid/content/Context;)Le/b/a/d;

    move-result-object v0

    .line 5
    iget-object v1, p0, Le/b/a/z/v;->e:Le/b/a/z/v$a;

    new-instance v2, Le/b/a/z/b;

    invoke-direct {v2}, Le/b/a/z/b;-><init>()V

    new-instance v3, Le/b/a/z/i;

    invoke-direct {v3}, Le/b/a/z/i;-><init>()V

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 7
    invoke-interface {v1, v0, v2, v3, p1}, Le/b/a/z/v$a;->a(Le/b/a/d;Le/b/a/z/m;Le/b/a/z/w;Landroid/content/Context;)Le/b/a/u;

    move-result-object p1

    iput-object p1, p0, Le/b/a/z/v;->a:Le/b/a/u;

    .line 8
    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 9
    :cond_1
    :goto_0
    iget-object p1, p0, Le/b/a/z/v;->a:Le/b/a/u;

    return-object p1
.end method

.method public b(Landroid/app/Activity;)Le/b/a/z/t;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 16
    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Landroid/app/Fragment;)Le/b/a/z/t;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/app/FragmentManager;Lc/e/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/FragmentManager;",
            "Lc/e/b<",
            "Landroid/view/View;",
            "Landroid/app/Fragment;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, Le/b/a/z/v;->h:Landroid/os/Bundle;

    add-int/lit8 v2, v0, 0x1

    const-string v3, "key"

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/4 v0, 0x0

    .line 11
    :try_start_0
    iget-object v1, p0, Le/b/a/z/v;->h:Landroid/os/Bundle;

    invoke-virtual {p1, v1, v3}, Landroid/app/FragmentManager;->getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :goto_1
    if-nez v0, :cond_0

    return-void

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 13
    invoke-virtual {v0}, Landroid/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v1, v3, :cond_1

    .line 15
    invoke-virtual {v0}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Lc/e/b;)V

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 1
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v3, p1, Landroid/os/Message;->what:I

    const/4 v4, 0x0

    if-eq v3, v2, :cond_2

    const/4 v5, 0x2

    if-eq v3, v5, :cond_1

    move-object p1, v4

    const/4 v2, 0x0

    goto :goto_2

    .line 3
    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lc/l/d/o1;

    .line 4
    invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Lc/l/d/o1;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 5
    iget-object v0, p0, Le/b/a/z/v;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    .line 6
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/app/FragmentManager;

    .line 7
    invoke-virtual {p0, p1, v0}, Le/b/a/z/v;->a(Landroid/app/FragmentManager;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Le/b/a/z/v;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_1
    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    move-object p1, v4

    :goto_2
    const/4 v0, 0x5

    const-string v3, "RMRetriever"

    .line 9
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    if-nez v4, :cond_4

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to remove expected request manager fragment, manager: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return v2
.end method
