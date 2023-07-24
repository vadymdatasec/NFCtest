.class public final Le/e/a/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/graphics/drawable/Drawable;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/Integer;

.field public i:Ljava/lang/Integer;

.field public j:Ljava/lang/Integer;

.field public k:Le/e/a/h;

.field public l:Z

.field public m:Z

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/Boolean;

.field public p:Ljava/lang/Boolean;

.field public final q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Le/e/a/g;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public s:Le/e/a/r;

.field public t:Le/e/a/a0;

.field public u:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/e/a/q;->q:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Le/e/a/q;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static final synthetic a(Le/e/a/q;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
    .locals 0

    .line 1
    iget-object p0, p0, Le/e/a/q;->u:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    return-object p0
.end method


# virtual methods
.method public final a()Le/e/a/o;
    .locals 2

    .line 8
    iget-object v0, p0, Le/e/a/q;->o:Ljava/lang/Boolean;

    const/4 v1, 0x1

    .line 9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    if-nez v0, :cond_0

    iput-object v1, p0, Le/e/a/q;->o:Ljava/lang/Boolean;

    .line 10
    :cond_0
    iget-object v0, p0, Le/e/a/q;->p:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 11
    iput-object v1, p0, Le/e/a/q;->p:Ljava/lang/Boolean;

    .line 12
    :cond_1
    new-instance v0, Le/e/a/o;

    invoke-direct {v0, p0}, Le/e/a/o;-><init>(Le/e/a/q;)V

    return-object v0
.end method

.method public final a(I)Le/e/a/q;
    .locals 0

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Le/e/a/q;->g:Ljava/lang/Integer;

    return-object p0
.end method

.method public final a(Landroid/view/View;)Le/e/a/q;
    .locals 1

    const-string v0, "targetView"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Le/e/a/q;->r:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public final a(Le/e/a/a0;)Le/e/a/q;
    .locals 1

    const-string v0, "sequenceShowCaseListener"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iput-object p1, p0, Le/e/a/q;->t:Le/e/a/a0;

    return-object p0
.end method

.method public final a(Le/e/a/r;)Le/e/a/q;
    .locals 1

    const-string v0, "bubbleShowCaseListener"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iput-object p1, p0, Le/e/a/q;->s:Le/e/a/r;

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Le/e/a/q;
    .locals 1

    const-string v0, "subtitle"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Le/e/a/q;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final a(Z)Le/e/a/q;
    .locals 0

    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Le/e/a/q;->o:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Le/e/a/q;
    .locals 1

    const-string v0, "ignoreTitle"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Le/e/a/q;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final b(Z)Le/e/a/q;
    .locals 0

    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Le/e/a/q;->p:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final b()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/e/a/q;->a:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Le/e/a/q;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Le/e/a/q;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Le/e/a/g;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/e/a/q;->q:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Le/e/a/r;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->s:Le/e/a/r;

    return-object v0
.end method

.method public final f()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->f:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/e/a/q;->m:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/e/a/q;->l:Z

    return v0
.end method

.method public final i()Le/e/a/h;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->k:Le/e/a/h;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final l()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->o:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final m()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->p:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final n()Le/e/a/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->t:Le/e/a/a0;

    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final q()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public final r()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/e/a/q;->r:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method public final s()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final u()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/q;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public final v()Le/e/a/o;
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/e/a/q;->a()Le/e/a/o;

    move-result-object v0

    .line 2
    iget-object v1, p0, Le/e/a/q;->r:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_4

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 3
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_2

    const-string v2, "targetView!!"

    .line 4
    invoke-static {v1, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Le/e/a/o;->k()V

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    new-instance v2, Le/e/a/p;

    invoke-direct {v2, p0, v0, v1}, Le/e/a/p;-><init>(Le/e/a/q;Le/e/a/o;Landroid/view/View;)V

    iput-object v2, p0, Le/e/a/q;->u:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, p0, Le/e/a/q;->u:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 9
    :cond_3
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 10
    :cond_4
    invoke-virtual {v0}, Le/e/a/o;->k()V

    :goto_1
    return-object v0
.end method
