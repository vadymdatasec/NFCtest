.class public abstract Lc/v/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lc/v/k0;

.field public static b:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/ref/WeakReference<",
            "Lc/e/b<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList<",
            "Lc/v/k0;",
            ">;>;>;>;"
        }
    .end annotation
.end field

.field public static c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/v/c;

    invoke-direct {v0}, Lc/v/c;-><init>()V

    sput-object v0, Lc/v/o0;->a:Lc/v/k0;

    .line 2
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lc/v/o0;->b:Ljava/lang/ThreadLocal;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lc/v/o0;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public static a()Lc/e/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/e/b<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList<",
            "Lc/v/k0;",
            ">;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lc/v/o0;->b:Ljava/lang/ThreadLocal;

    .line 2
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/e/b;

    if-eqz v0, :cond_0

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    .line 5
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 6
    sget-object v2, Lc/v/o0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Landroid/view/ViewGroup;Lc/v/k0;)V
    .locals 1

    .line 7
    sget-object v0, Lc/v/o0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lc/h/n/v0;->D(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    sget-object v0, Lc/v/o0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_0

    .line 9
    sget-object p1, Lc/v/o0;->a:Lc/v/k0;

    .line 10
    :cond_0
    invoke-virtual {p1}, Lc/v/k0;->clone()Lc/v/k0;

    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Lc/v/o0;->c(Landroid/view/ViewGroup;Lc/v/k0;)V

    const/4 v0, 0x0

    .line 12
    invoke-static {p0, v0}, Lc/v/d0;->a(Landroid/view/View;Lc/v/d0;)V

    .line 13
    invoke-static {p0, p1}, Lc/v/o0;->b(Landroid/view/ViewGroup;Lc/v/k0;)V

    :cond_1
    return-void
.end method

.method public static b(Landroid/view/ViewGroup;Lc/v/k0;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    .line 1
    new-instance v0, Lc/v/n0;

    invoke-direct {v0, p1, p0}, Lc/v/n0;-><init>(Lc/v/k0;Landroid/view/ViewGroup;)V

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    return-void
.end method

.method public static c(Landroid/view/ViewGroup;Lc/v/k0;)V
    .locals 2

    .line 1
    invoke-static {}, Lc/v/o0;->a()Lc/e/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/v/k0;

    .line 4
    invoke-virtual {v1, p0}, Lc/v/k0;->c(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1, p0, v0}, Lc/v/k0;->a(Landroid/view/ViewGroup;Z)V

    .line 6
    :cond_1
    invoke-static {p0}, Lc/v/d0;->a(Landroid/view/View;)Lc/v/d0;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 7
    invoke-virtual {p0}, Lc/v/d0;->a()V

    :cond_2
    return-void
.end method
