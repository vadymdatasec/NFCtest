.class public Lc/b/k/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/h/n/f1;


# instance fields
.field public final synthetic a:Lc/b/k/f1;


# direct methods
.method public constructor <init>(Lc/b/k/f1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/d1;->a:Lc/b/k/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc/b/k/d1;->a:Lc/b/k/f1;

    iget-object p1, p1, Lc/b/k/f1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    .line 2
    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
