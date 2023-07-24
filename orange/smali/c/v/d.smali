.class public Lc/v/d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/graphics/drawable/BitmapDrawable;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:F


# direct methods
.method public constructor <init>(Lc/v/o;Landroid/view/ViewGroup;Landroid/graphics/drawable/BitmapDrawable;Landroid/view/View;F)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/v/d;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lc/v/d;->b:Landroid/graphics/drawable/BitmapDrawable;

    iput-object p4, p0, Lc/v/d;->c:Landroid/view/View;

    iput p5, p0, Lc/v/d;->d:F

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/v/d;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lc/v/j1;->b(Landroid/view/View;)Lc/v/g1;

    move-result-object p1

    iget-object v0, p0, Lc/v/d;->b:Landroid/graphics/drawable/BitmapDrawable;

    invoke-interface {p1, v0}, Lc/v/g1;->b(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lc/v/d;->c:Landroid/view/View;

    iget v0, p0, Lc/v/d;->d:F

    invoke-static {p1, v0}, Lc/v/j1;->a(Landroid/view/View;F)V

    return-void
.end method
