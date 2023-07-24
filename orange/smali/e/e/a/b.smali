.class public final Le/e/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public b:Landroid/graphics/RectF;

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:Ljava/lang/Boolean;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Landroid/graphics/drawable/Drawable;

.field public h:Ljava/lang/Integer;

.field public i:Ljava/lang/Integer;

.field public j:Ljava/lang/Integer;

.field public k:Ljava/lang/Integer;

.field public l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Le/e/a/g;",
            ">;"
        }
    .end annotation
.end field

.field public m:Le/e/a/u;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/e/a/b;->l:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Le/e/a/b;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Le/e/a/b;->a:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public final a(Landroid/graphics/RectF;)Le/e/a/b;
    .locals 1

    const-string v0, "targetViewLocationOnScreen"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iput-object p1, p0, Le/e/a/b;->b:Landroid/graphics/RectF;

    return-object p0
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)Le/e/a/b;
    .locals 0

    .line 3
    iput-object p1, p0, Le/e/a/b;->g:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final a(Le/e/a/u;)Le/e/a/b;
    .locals 0

    .line 9
    iput-object p1, p0, Le/e/a/b;->m:Le/e/a/u;

    return-object p0
.end method

.method public final a(Ljava/lang/Integer;)Le/e/a/b;
    .locals 0

    .line 6
    iput-object p1, p0, Le/e/a/b;->h:Ljava/lang/Integer;

    return-object p0
.end method

.method public final a(Ljava/lang/String;)Le/e/a/b;
    .locals 0

    .line 2
    iput-object p1, p0, Le/e/a/b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final a(Ljava/util/List;)Le/e/a/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Le/e/a/g;",
            ">;)",
            "Le/e/a/b;"
        }
    .end annotation

    const-string v0, "arrowPosition"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Le/e/a/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 8
    iget-object v0, p0, Le/e/a/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final a(Z)Le/e/a/b;
    .locals 0

    .line 4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Le/e/a/b;->d:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final a()Le/e/a/f;
    .locals 3

    .line 10
    new-instance v0, Le/e/a/f;

    iget-object v1, p0, Le/e/a/b;->a:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "mContext.get()!!"

    invoke-static {v1, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Le/e/a/f;-><init>(Landroid/content/Context;Le/e/a/b;)V

    return-object v0

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    :cond_1
    const-string v0, "mContext"

    invoke-static {v0}, Li/h/c/k;->e(Ljava/lang/String;)V

    throw v2
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)Le/e/a/b;
    .locals 0

    .line 3
    iput-object p1, p0, Le/e/a/b;->c:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final b(Ljava/lang/Integer;)Le/e/a/b;
    .locals 0

    .line 4
    iput-object p1, p0, Le/e/a/b;->k:Ljava/lang/Integer;

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Le/e/a/b;
    .locals 0

    .line 2
    iput-object p1, p0, Le/e/a/b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final b()Ljava/util/ArrayList;
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
    iget-object v0, p0, Le/e/a/b;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final c(Ljava/lang/Integer;)Le/e/a/b;
    .locals 0

    .line 2
    iput-object p1, p0, Le/e/a/b;->i:Ljava/lang/Integer;

    return-object p0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public final d()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->g:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final d(Ljava/lang/Integer;)Le/e/a/b;
    .locals 0

    .line 2
    iput-object p1, p0, Le/e/a/b;->j:Ljava/lang/Integer;

    return-object p0
.end method

.method public final e()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final f()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->c:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final g()Le/e/a/u;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->m:Le/e/a/u;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->k:Ljava/lang/Integer;

    return-object v0
.end method

.method public final j()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->b:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final m()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/b;->j:Ljava/lang/Integer;

    return-object v0
.end method
