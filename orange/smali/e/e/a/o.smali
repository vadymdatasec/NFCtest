.class public final Le/e/a/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Landroid/widget/RelativeLayout;

.field public B:Le/e/a/b;

.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Landroid/graphics/drawable/Drawable;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Landroid/graphics/drawable/Drawable;

.field public final m:Ljava/lang/Integer;

.field public final n:Ljava/lang/Integer;

.field public final o:Ljava/lang/Integer;

.field public final p:Ljava/lang/Integer;

.field public final q:Ljava/lang/String;

.field public final r:Z

.field public final s:Z

.field public final t:Le/e/a/h;

.field public final u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/e/a/g;",
            ">;"
        }
    .end annotation
.end field

.field public final v:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Le/e/a/r;

.field public final x:Le/e/a/a0;

.field public final y:Z

.field public final z:Z


# direct methods
.method public constructor <init>(Le/e/a/q;)V
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "BubbleShowCasePrefs"

    .line 2
    iput-object v0, p0, Le/e/a/o;->a:Ljava/lang/String;

    const/16 v0, 0x2db

    .line 3
    iput v0, p0, Le/e/a/o;->b:I

    const/16 v0, 0xc8

    .line 4
    iput v0, p0, Le/e/a/o;->c:I

    const/16 v0, 0x2bc

    .line 5
    iput v0, p0, Le/e/a/o;->d:I

    .line 6
    iput v0, p0, Le/e/a/o;->e:I

    const/16 v0, 0x1a4

    .line 7
    iput v0, p0, Le/e/a/o;->f:I

    .line 8
    invoke-virtual {p1}, Le/e/a/q;->b()Ljava/lang/ref/WeakReference;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iput-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    .line 9
    invoke-virtual {p1}, Le/e/a/q;->k()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->h:Landroid/graphics/drawable/Drawable;

    .line 10
    invoke-virtual {p1}, Le/e/a/q;->t()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->i:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Le/e/a/q;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->j:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Le/e/a/q;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->k:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Le/e/a/q;->f()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->l:Landroid/graphics/drawable/Drawable;

    .line 14
    invoke-virtual {p1}, Le/e/a/q;->d()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->m:Ljava/lang/Integer;

    .line 15
    invoke-virtual {p1}, Le/e/a/q;->s()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->n:Ljava/lang/Integer;

    .line 16
    invoke-virtual {p1}, Le/e/a/q;->u()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->o:Ljava/lang/Integer;

    .line 17
    invoke-virtual {p1}, Le/e/a/q;->q()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->p:Ljava/lang/Integer;

    .line 18
    invoke-virtual {p1}, Le/e/a/q;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->q:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Le/e/a/q;->h()Z

    move-result v0

    iput-boolean v0, p0, Le/e/a/o;->r:Z

    .line 20
    invoke-virtual {p1}, Le/e/a/q;->g()Z

    move-result v0

    iput-boolean v0, p0, Le/e/a/o;->s:Z

    .line 21
    invoke-virtual {p1}, Le/e/a/q;->i()Le/e/a/h;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->t:Le/e/a/h;

    .line 22
    invoke-virtual {p1}, Le/e/a/q;->c()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->u:Ljava/util/List;

    .line 23
    invoke-virtual {p1}, Le/e/a/q;->r()Ljava/lang/ref/WeakReference;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->v:Ljava/lang/ref/WeakReference;

    .line 24
    invoke-virtual {p1}, Le/e/a/q;->e()Le/e/a/r;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->w:Le/e/a/r;

    .line 25
    invoke-virtual {p1}, Le/e/a/q;->n()Le/e/a/a0;

    move-result-object v0

    iput-object v0, p0, Le/e/a/o;->x:Le/e/a/a0;

    .line 26
    invoke-virtual {p1}, Le/e/a/q;->l()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Le/e/a/o;->y:Z

    .line 27
    invoke-virtual {p1}, Le/e/a/q;->m()Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Le/e/a/o;->z:Z

    return-void

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 28
    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 29
    :cond_2
    invoke-static {}, Li/h/c/k;->b()V

    throw v1
.end method

.method public static final synthetic a(Le/e/a/o;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 3
    iget-object p0, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method public static final synthetic a(Le/e/a/o;Landroid/view/View;Landroid/widget/RelativeLayout;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Le/e/a/o;->a(Landroid/view/View;Landroid/widget/RelativeLayout;)V

    return-void
.end method

.method public static final synthetic a(Le/e/a/o;Landroid/view/View;Le/e/a/b;Landroid/widget/RelativeLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Le/e/a/o;->a(Landroid/view/View;Le/e/a/b;Landroid/widget/RelativeLayout;)V

    return-void
.end method

.method public static final synthetic a(Le/e/a/o;Le/e/a/b;)V
    .locals 0

    .line 5
    iput-object p1, p0, Le/e/a/o;->B:Le/e/a/b;

    return-void
.end method

.method public static final synthetic a(Le/e/a/o;Landroid/view/View;)Z
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Le/e/a/o;->c(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Le/e/a/o;)Le/e/a/b;
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/e/a/o;->e()Le/e/a/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Le/e/a/o;)Le/e/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Le/e/a/o;->B:Le/e/a/b;

    return-object p0
.end method

.method public static final synthetic d(Le/e/a/o;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static final synthetic e(Le/e/a/o;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Le/e/a/o;->u:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic f(Le/e/a/o;)Le/e/a/r;
    .locals 0

    .line 1
    iget-object p0, p0, Le/e/a/o;->w:Le/e/a/r;

    return-object p0
.end method

.method public static final synthetic g(Le/e/a/o;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Le/e/a/o;->r:Z

    return p0
.end method

.method public static final synthetic h(Le/e/a/o;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Le/e/a/o;->v:Ljava/lang/ref/WeakReference;

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 106
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 107
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v0

    goto :goto_0

    .line 108
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int v1, v0

    div-int/lit16 v0, v1, 0x3e8

    :goto_0
    return v0
.end method

.method public final a(I)I
    .locals 2

    .line 114
    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    iget v1, p0, Le/e/a/o;->f:I

    invoke-virtual {v0, v1}, Le/e/a/z;->a(I)I

    move-result v0

    if-le p1, v0, :cond_0

    sget-object p1, Le/e/a/z;->a:Le/e/a/z;

    iget v0, p0, Le/e/a/o;->f:I

    invoke-virtual {p1, v0}, Le/e/a/z;->a(I)I

    move-result p1

    :cond_0
    return p1
.end method

.method public final a(Landroid/content/Context;)I
    .locals 1

    .line 113
    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p1}, Le/e/a/z;->a(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p0}, Le/e/a/o;->g()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public final a(Landroid/view/View;)I
    .locals 1

    .line 112
    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p1}, Le/e/a/z;->a(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p0}, Le/e/a/o;->f()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public final a(Landroid/view/View;Le/e/a/h;)Landroid/graphics/Bitmap;
    .locals 1

    if-eqz p2, :cond_1

    .line 109
    sget-object v0, Le/e/a/h;->b:Le/e/a/h;

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {p0, p1}, Le/e/a/o;->e(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    .line 111
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Le/e/a/o;->d(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/app/Activity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x1020002

    .line 6
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    const-string v0, "androidContent"

    .line 7
    invoke-static {p1, v0}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    const-string v0, "androidContent.parent"

    invoke-static {p1, v0}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 19
    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 20
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final a(Landroid/view/View;Landroid/widget/RelativeLayout;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Le/e/a/o;->t:Le/e/a/h;

    invoke-virtual {p0, p1, v0}, Le/e/a/o;->a(Landroid/view/View;Le/e/a/h;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 22
    new-instance v1, Landroid/widget/ImageView;

    iget-object v2, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 23
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 24
    new-instance v0, Le/e/a/j;

    invoke-direct {v0, p0}, Le/e/a/j;-><init>(Le/e/a/o;)V

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 26
    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v2

    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v4

    iget-object v5, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_2

    const-string v3, "mActivity.get()!!"

    invoke-static {v5, v3}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/content/Context;

    invoke-virtual {p0, v5}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    add-int/2addr v5, p1

    sub-int/2addr v3, v5

    const/4 p1, 0x0

    invoke-virtual {v0, v2, v4, v3, p1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    if-eqz p2, :cond_1

    .line 27
    sget-object v2, Le/e/a/a;->a:Le/e/a/a;

    iget v3, p0, Le/e/a/o;->e:I

    invoke-virtual {v2, v1, p1, v3}, Le/e/a/a;->a(Landroid/view/View;II)Landroid/view/View;

    invoke-virtual {p2, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void

    .line 28
    :cond_2
    invoke-static {}, Li/h/c/k;->b()V

    throw v3

    .line 29
    :cond_3
    invoke-static {}, Li/h/c/k;->b()V

    throw v3
.end method

.method public final a(Landroid/view/View;Le/e/a/b;Landroid/widget/RelativeLayout;)V
    .locals 10

    if-nez p1, :cond_0

    return-void

    .line 30
    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 31
    invoke-virtual {p2}, Le/e/a/b;->b()Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/e/a/g;

    sget-object v3, Le/e/a/i;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x1

    const/16 v4, 0xc

    const/16 v5, 0xa

    const/4 v6, 0x0

    const-string v7, "mActivity.get()!!"

    if-eq v1, v3, :cond_1f

    const/4 v3, 0x2

    if-eq v1, v3, :cond_17

    const/4 v3, 0x3

    if-eq v1, v3, :cond_d

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    goto/16 :goto_c

    .line 32
    :cond_1
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 33
    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    iget-object v3, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-static {v3, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/app/Activity;

    invoke-virtual {v1, v3, p1}, Le/e/a/z;->a(Landroid/app/Activity;Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 34
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 35
    :goto_0
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {v3, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/content/Context;

    invoke-virtual {p0, v3}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v4

    sub-int/2addr v3, v4

    iget-object v4, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v4, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/content/Context;

    invoke-virtual {p0, v4}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p0, v4}, Le/e/a/o;->a(I)I

    move-result v4

    sub-int/2addr v3, v4

    goto :goto_1

    :cond_3
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_4
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_5
    const/4 v3, 0x0

    .line 36
    :goto_1
    iget-object v4, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-static {v4, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/content/Context;

    invoke-virtual {p0, v4}, Le/e/a/o;->a(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v5

    sub-int/2addr v4, v5

    .line 37
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto/16 :goto_c

    .line 38
    :cond_6
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    .line 39
    :cond_7
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p0, v3}, Le/e/a/o;->a(I)I

    move-result v3

    sub-int/2addr v1, v3

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    .line 40
    :goto_2
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-static {v3, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/content/Context;

    invoke-virtual {p0, v3}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    goto :goto_3

    :cond_9
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_a
    const/4 v3, 0x0

    .line 41
    :goto_3
    iget-object v4, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-static {v4, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/content/Context;

    invoke-virtual {p0, v4}, Le/e/a/o;->a(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v5

    sub-int/2addr v4, v5

    .line 42
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto/16 :goto_c

    .line 43
    :cond_b
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    .line 44
    :cond_c
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    .line 45
    :cond_d
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 46
    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    iget-object v3, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_16

    invoke-static {v3, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/app/Activity;

    invoke-virtual {v1, v3, p1}, Le/e/a/z;->a(Landroid/app/Activity;Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 47
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    goto :goto_4

    :cond_e
    const/4 v1, 0x0

    .line 48
    :goto_4
    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    .line 49
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v4

    if-eqz v4, :cond_11

    iget-object v4, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_10

    invoke-static {v4, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/content/Context;

    invoke-virtual {p0, v4}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-static {v5, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/content/Context;

    invoke-virtual {p0, v5}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {p0, v5}, Le/e/a/o;->a(I)I

    move-result v5

    sub-int/2addr v4, v5

    goto :goto_5

    :cond_f
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_10
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_11
    const/4 v4, 0x0

    .line 50
    :goto_5
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto/16 :goto_c

    .line 51
    :cond_12
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p0, v3}, Le/e/a/o;->a(I)I

    move-result v3

    sub-int/2addr v1, v3

    goto :goto_6

    :cond_13
    const/4 v1, 0x0

    .line 52
    :goto_6
    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    .line 53
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v4

    if-eqz v4, :cond_15

    iget-object v4, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_14

    invoke-static {v4, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/content/Context;

    invoke-virtual {p0, v4}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v5

    sub-int/2addr v4, v5

    goto :goto_7

    :cond_14
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_15
    const/4 v4, 0x0

    .line 54
    :goto_7
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto/16 :goto_c

    .line 55
    :cond_16
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_17
    const/16 v1, 0xb

    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 57
    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    iget-object v3, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1e

    invoke-static {v3, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/app/Activity;

    invoke-virtual {v1, v3, p1}, Le/e/a/z;->b(Landroid/app/Activity;Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 58
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p0, v3}, Le/e/a/o;->a(I)I

    move-result v3

    sub-int/2addr v1, v3

    goto :goto_8

    :cond_18
    const/4 v1, 0x0

    .line 59
    :goto_8
    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v3

    .line 60
    iget-object v4, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_19

    invoke-static {v4, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/content/Context;

    invoke-virtual {p0, v4}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v6

    sub-int/2addr v4, v6

    .line 61
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 62
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto/16 :goto_c

    .line 63
    :cond_19
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    .line 64
    :cond_1a
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p0, v3}, Le/e/a/o;->a(I)I

    move-result v3

    sub-int/2addr v1, v3

    goto :goto_9

    :cond_1b
    const/4 v1, 0x0

    .line 65
    :goto_9
    iget-object v3, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1d

    invoke-static {v3, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/content/Context;

    invoke-virtual {p0, v3}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v5

    sub-int/2addr v3, v5

    .line 66
    iget-object v5, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_1c

    invoke-static {v5, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/content/Context;

    invoke-virtual {p0, v5}, Le/e/a/o;->a(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v6

    sub-int/2addr v5, v6

    .line 67
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 68
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto/16 :goto_c

    .line 69
    :cond_1c
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    .line 70
    :cond_1d
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    .line 71
    :cond_1e
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_1f
    const/16 v1, 0x9

    .line 72
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 73
    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    iget-object v3, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_29

    invoke-static {v3, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/app/Activity;

    invoke-virtual {v1, v3, p1}, Le/e/a/z;->b(Landroid/app/Activity;Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_23

    .line 74
    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v1, v3

    .line 75
    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v3

    .line 76
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v4

    if-eqz v4, :cond_22

    iget-object v4, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_21

    invoke-static {v4, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/content/Context;

    invoke-virtual {p0, v4}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v4

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v8

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v8, v9

    sub-int/2addr v4, v8

    iget-object v8, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v8}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_20

    invoke-static {v8, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/content/Context;

    invoke-virtual {p0, v8}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v6

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v7

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v8

    add-int/2addr v7, v8

    sub-int/2addr v6, v7

    invoke-virtual {p0, v6}, Le/e/a/o;->a(I)I

    move-result v6

    sub-int/2addr v4, v6

    goto :goto_a

    :cond_20
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_21
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_22
    const/4 v4, 0x0

    .line 77
    :goto_a
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 78
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_c

    .line 79
    :cond_23
    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v1, v3

    .line 80
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v3

    if-eqz v3, :cond_26

    iget-object v3, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_25

    invoke-static {v3, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/content/Context;

    invoke-virtual {p0, v3}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v3

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v8

    add-int/2addr v5, v8

    sub-int/2addr v3, v5

    iget-object v5, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_24

    invoke-static {v5, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/content/Context;

    invoke-virtual {p0, v5}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v8

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v9

    add-int/2addr v8, v9

    sub-int/2addr v5, v8

    invoke-virtual {p0, v5}, Le/e/a/o;->a(I)I

    move-result v5

    sub-int/2addr v3, v5

    goto :goto_b

    :cond_24
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_25
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    :cond_26
    const/4 v3, 0x0

    .line 81
    :goto_b
    iget-object v5, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_28

    invoke-static {v5, v7}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/content/Context;

    invoke-virtual {p0, v5}, Le/e/a/o;->a(Landroid/content/Context;)I

    move-result v5

    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v6

    sub-int/2addr v5, v6

    .line 82
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 83
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 84
    :goto_c
    new-instance v1, Landroid/graphics/RectF;

    .line 85
    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v3

    int-to-float v3, v3

    .line 86
    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v4

    int-to-float v4, v4

    .line 87
    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v5, v6

    .line 88
    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr v6, p1

    .line 89
    invoke-direct {v1, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p2, v1}, Le/e/a/b;->a(Landroid/graphics/RectF;)Le/e/a/b;

    .line 90
    invoke-virtual {p2}, Le/e/a/b;->a()Le/e/a/f;

    move-result-object p1

    .line 91
    invoke-virtual {p0}, Le/e/a/o;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->setId(I)V

    .line 92
    sget-object p2, Le/e/a/a;->a:Le/e/a/a;

    iget v1, p0, Le/e/a/o;->c:I

    invoke-virtual {p2, v2, v1}, Le/e/a/a;->b(II)Landroid/view/animation/Animation;

    move-result-object p2

    if-eqz p3, :cond_27

    .line 93
    sget-object v1, Le/e/a/a;->a:Le/e/a/a;

    invoke-virtual {v1, p1, p2}, Le/e/a/a;->a(Landroid/view/View;Landroid/view/animation/Animation;)Landroid/view/View;

    invoke-virtual {p3, p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_27
    return-void

    .line 94
    :cond_28
    invoke-static {}, Li/h/c/k;->b()V

    throw v6

    .line 95
    :cond_29
    invoke-static {}, Li/h/c/k;->b()V

    throw v6
.end method

.method public final a(Landroid/widget/RelativeLayout;)V
    .locals 3

    .line 8
    iget-object v0, p0, Le/e/a/o;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 9
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xb

    const/4 v2, -0x1

    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v1, 0xc

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 12
    invoke-virtual {p0}, Le/e/a/o;->h()Landroid/widget/TextView;

    move-result-object v1

    .line 13
    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public final a(Le/e/a/b;Landroid/widget/RelativeLayout;)V
    .locals 7

    .line 96
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xf

    .line 97
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 98
    invoke-virtual {p1}, Le/e/a/b;->a()Le/e/a/f;

    move-result-object p1

    .line 99
    invoke-virtual {p0}, Le/e/a/o;->a()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->setId(I)V

    .line 100
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 101
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v1

    const/4 v3, 0x0

    const-string v4, "mActivity.get()!!"

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1, v4}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sget-object v5, Le/e/a/z;->a:Le/e/a/z;

    iget v6, p0, Le/e/a/o;->f:I

    invoke-virtual {v5, v6}, Le/e/a/z;->a(I)I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    sub-int/2addr v1, v5

    goto :goto_0

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    throw v3

    :cond_1
    const/4 v1, 0x0

    .line 102
    :goto_0
    invoke-virtual {p0}, Le/e/a/o;->i()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-static {v5, v4}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/content/Context;

    invoke-virtual {p0, v5}, Le/e/a/o;->b(Landroid/content/Context;)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sget-object v4, Le/e/a/z;->a:Le/e/a/z;

    iget v5, p0, Le/e/a/o;->f:I

    invoke-virtual {v4, v5}, Le/e/a/z;->a(I)I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    goto :goto_1

    :cond_2
    invoke-static {}, Li/h/c/k;->b()V

    throw v3

    :cond_3
    const/4 v3, 0x0

    .line 103
    :goto_1
    invoke-virtual {v0, v1, v2, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 104
    :cond_4
    sget-object v1, Le/e/a/a;->a:Le/e/a/a;

    iget v3, p0, Le/e/a/o;->c:I

    invoke-virtual {v1, v2, v3}, Le/e/a/a;->b(II)Landroid/view/animation/Animation;

    move-result-object v1

    if-eqz p2, :cond_5

    .line 105
    sget-object v2, Le/e/a/a;->a:Le/e/a/a;

    invoke-virtual {v2, p1, v1}, Le/e/a/a;->a(Landroid/view/View;Landroid/view/animation/Animation;)Landroid/view/View;

    invoke-virtual {p2, p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 3

    .line 14
    iget-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Le/e/a/o;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "mPrefs"

    .line 15
    invoke-static {v0, v1}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, Le/e/a/o;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2

    .line 16
    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(Landroid/content/Context;)I
    .locals 1

    .line 13
    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p1}, Le/e/a/z;->b(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p0}, Le/e/a/o;->f()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public final b(Landroid/view/View;)I
    .locals 1

    .line 12
    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p1}, Le/e/a/z;->b(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p0}, Le/e/a/o;->g()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public final b()V
    .locals 1

    .line 2
    iget-object v0, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Le/e/a/o;->z:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Le/e/a/o;->c()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 5
    :cond_1
    iget-object v0, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p0, v0}, Le/e/a/o;->a(Landroid/widget/RelativeLayout;)V

    .line 7
    :cond_2
    :goto_0
    invoke-virtual {p0}, Le/e/a/o;->j()V

    return-void
.end method

.method public final b(Landroid/widget/RelativeLayout;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 8
    new-instance v0, Le/e/a/m;

    invoke-direct {v0, p0}, Le/e/a/m;-><init>(Le/e/a/o;)V

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 9
    iget-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Le/e/a/o;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "mPrefs"

    .line 10
    invoke-static {v0, v1}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1, p1}, Le/e/a/o;->a(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 11
    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final c()V
    .locals 3

    .line 2
    iget-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "mActivity.get()!!"

    invoke-static {v0, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Le/e/a/o;->a(Landroid/app/Activity;)Landroid/view/ViewGroup;

    move-result-object v0

    .line 3
    iget-object v2, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 4
    iput-object v1, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    return-void

    .line 5
    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    throw v1
.end method

.method public final c(Landroid/view/View;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    if-ltz v1, :cond_1

    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v1

    if-ltz v1, :cond_1

    .line 7
    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public final d(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 6

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "mActivity.get()!!"

    invoke-static {v0, v1}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Le/e/a/o;->a(Landroid/app/Activity;)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/view/View;->buildDrawingCache()V

    const-string v2, "currentScreenView"

    .line 17
    invoke-static {v0, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {p0, p1}, Le/e/a/o;->a(Landroid/view/View;)I

    move-result v3

    invoke-virtual {p0, p1}, Le/e/a/o;->b(Landroid/view/View;)I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {v2, v3, v4, v5, p1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v2, "Bitmap.createBitmap(curr\u2026width, targetView.height)"

    invoke-static {p1, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    return-object p1

    .line 20
    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public final d()Landroid/widget/RelativeLayout;
    .locals 4

    .line 2
    iget-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    check-cast v0, Landroid/app/Activity;

    iget v2, p0, Le/e/a/o;->b:I

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/app/Activity;

    iget v1, p0, Le/e/a/o;->b:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "mActivity.get()!!.findVi\u2026yId(FOREGROUND_LAYOUT_ID)"

    invoke-static {v0, v1}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 4
    :cond_1
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v2, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    check-cast v2, Landroid/content/Context;

    invoke-direct {v0, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 5
    iget v2, p0, Le/e/a/o;->b:I

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setId(I)V

    .line 6
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 7
    iget-object v2, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, Landroid/content/Context;

    sget v1, Le/e/a/w;->transparent_grey:I

    invoke-static {v2, v1}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 9
    invoke-virtual {p0, v0}, Le/e/a/o;->a(Landroid/widget/RelativeLayout;)V

    return-object v0

    .line 10
    :cond_2
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 11
    :cond_3
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 12
    :cond_4
    invoke-static {}, Li/h/c/k;->b()V

    throw v1
.end method

.method public final e(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 2

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "Bitmap.createBitmap(targetView.drawingCache)"

    invoke-static {v0, v1}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 19
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e()Le/e/a/b;
    .locals 3

    .line 2
    new-instance v0, Le/e/a/b;

    invoke-direct {v0}, Le/e/a/b;-><init>()V

    .line 3
    iget-object v1, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "mActivity.get()!!"

    invoke-static {v1, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Le/e/a/b;->a(Landroid/content/Context;)Le/e/a/b;

    .line 4
    iget-object v1, p0, Le/e/a/o;->u:Ljava/util/List;

    invoke-virtual {v0, v1}, Le/e/a/b;->a(Ljava/util/List;)Le/e/a/b;

    .line 5
    iget-object v1, p0, Le/e/a/o;->m:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Le/e/a/b;->a(Ljava/lang/Integer;)Le/e/a/b;

    .line 6
    iget-object v1, p0, Le/e/a/o;->n:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Le/e/a/b;->c(Ljava/lang/Integer;)Le/e/a/b;

    .line 7
    iget-object v1, p0, Le/e/a/o;->o:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Le/e/a/b;->d(Ljava/lang/Integer;)Le/e/a/b;

    .line 8
    iget-object v1, p0, Le/e/a/o;->p:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Le/e/a/b;->b(Ljava/lang/Integer;)Le/e/a/b;

    .line 9
    iget-object v1, p0, Le/e/a/o;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Le/e/a/b;->b(Ljava/lang/String;)Le/e/a/b;

    .line 10
    iget-object v1, p0, Le/e/a/o;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Le/e/a/b;->a(Ljava/lang/String;)Le/e/a/b;

    .line 11
    iget-object v1, p0, Le/e/a/o;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Le/e/a/b;->b(Landroid/graphics/drawable/Drawable;)Le/e/a/b;

    .line 12
    iget-object v1, p0, Le/e/a/o;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Le/e/a/b;->a(Landroid/graphics/drawable/Drawable;)Le/e/a/b;

    .line 13
    iget-boolean v1, p0, Le/e/a/o;->s:Z

    invoke-virtual {v0, v1}, Le/e/a/b;->a(Z)Le/e/a/b;

    .line 14
    new-instance v1, Le/e/a/k;

    invoke-direct {v1, p0}, Le/e/a/k;-><init>(Le/e/a/o;)V

    invoke-virtual {v0, v1}, Le/e/a/b;->a(Le/e/a/u;)Le/e/a/b;

    return-object v0

    .line 15
    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final f()I
    .locals 2

    .line 2
    iget-object v0, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Le/e/a/z;->a(Landroid/view/View;)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    const/4 v0, 0x0

    throw v0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g()I
    .locals 2

    .line 2
    iget-object v0, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Le/e/a/z;->b(Landroid/view/View;)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    const/4 v0, 0x0

    throw v0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final h()Landroid/widget/TextView;
    .locals 6

    .line 2
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3
    iget-object v1, p0, Le/e/a/o;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Le/e/a/z;->a(I)I

    move-result v1

    sget-object v3, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v3, v2}, Le/e/a/z;->a(I)I

    move-result v3

    sget-object v4, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v4, v2}, Le/e/a/z;->a(I)I

    move-result v4

    sget-object v5, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v5, v2}, Le/e/a/z;->a(I)I

    move-result v2

    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 5
    iget-object v1, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Landroid/content/Context;

    sget v2, Le/e/a/w;->transparent_grey:I

    invoke-static {v1, v2}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 6
    new-instance v1, Le/e/a/l;

    invoke-direct {v1, p0}, Le/e/a/l;-><init>(Le/e/a/o;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0

    .line 7
    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "mActivity.get()!!"

    invoke-static {v0, v1}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Le/e/a/v;->isTablet:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    return v0

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/e/a/o;->x:Le/e/a/a0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Le/e/a/a0;->onDismiss()V

    :cond_0
    return-void
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, Le/e/a/o;->q:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0, v0}, Le/e/a/o;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Le/e/a/o;->j()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Le/e/a/o;->q:Ljava/lang/String;

    invoke-virtual {p0, v0}, Le/e/a/o;->b(Ljava/lang/String;)V

    .line 5
    :cond_1
    iget-object v0, p0, Le/e/a/o;->g:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    const-string v2, "mActivity.get()!!"

    invoke-static {v0, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Le/e/a/o;->a(Landroid/app/Activity;)Landroid/view/ViewGroup;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Le/e/a/o;->d()Landroid/widget/RelativeLayout;

    move-result-object v2

    iput-object v2, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    .line 7
    invoke-virtual {p0, v2}, Le/e/a/o;->b(Landroid/widget/RelativeLayout;)V

    .line 8
    invoke-virtual {p0}, Le/e/a/o;->e()Le/e/a/b;

    move-result-object v2

    iput-object v2, p0, Le/e/a/o;->B:Le/e/a/b;

    .line 9
    iget-object v2, p0, Le/e/a/o;->v:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_2

    iget-object v2, p0, Le/e/a/o;->u:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_2

    .line 10
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 11
    new-instance v3, Le/e/a/n;

    invoke-direct {v3, p0}, Le/e/a/n;-><init>(Le/e/a/o;)V

    .line 12
    iget v4, p0, Le/e/a/o;->d:I

    int-to-long v4, v4

    .line 13
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 14
    :cond_2
    iget-object v2, p0, Le/e/a/o;->B:Le/e/a/b;

    if-eqz v2, :cond_5

    iget-object v3, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v2, v3}, Le/e/a/o;->a(Le/e/a/b;Landroid/widget/RelativeLayout;)V

    .line 15
    :goto_0
    iget-boolean v2, p0, Le/e/a/o;->y:Z

    if-eqz v2, :cond_4

    .line 16
    sget-object v2, Le/e/a/a;->a:Le/e/a/a;

    const/4 v3, 0x0

    iget v4, p0, Le/e/a/o;->d:I

    invoke-virtual {v2, v3, v4}, Le/e/a/a;->a(II)Landroid/view/animation/Animation;

    move-result-object v2

    .line 17
    iget-object v3, p0, Le/e/a/o;->A:Landroid/widget/RelativeLayout;

    if-eqz v3, :cond_4

    sget-object v4, Le/e/a/a;->a:Le/e/a/a;

    if-eqz v3, :cond_3

    invoke-virtual {v4, v3, v2}, Le/e/a/a;->a(Landroid/view/View;Landroid/view/animation/Animation;)Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1

    :cond_3
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    :cond_4
    :goto_1
    return-void

    .line 18
    :cond_5
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 19
    :cond_6
    invoke-static {}, Li/h/c/k;->b()V

    throw v1
.end method
