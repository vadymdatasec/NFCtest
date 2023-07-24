.class public Lc/b/k/c1;
.super Lc/h/n/e1;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/b/k/f1;


# direct methods
.method public constructor <init>(Lc/b/k/f1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/c1;->a:Lc/b/k/f1;

    invoke-direct {p0}, Lc/h/n/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/b/k/c1;->a:Lc/b/k/f1;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/b/k/f1;->v:Lc/b/p/m;

    .line 2
    iget-object p1, p1, Lc/b/k/f1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
