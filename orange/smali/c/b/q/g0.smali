.class public Lc/b/q/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Lc/b/q/q0;


# direct methods
.method public constructor <init>(Lc/b/q/q0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/g0;->b:Lc/b/q/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/q/g0;->b:Lc/b/q/q0;

    invoke-virtual {v0}, Lc/b/q/q0;->getInternalPopup()Lc/b/q/p0;

    move-result-object v0

    invoke-interface {v0}, Lc/b/q/p0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/q/g0;->b:Lc/b/q/q0;

    invoke-virtual {v0}, Lc/b/q/q0;->a()V

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/q/g0;->b:Lc/b/q/q0;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_1

    .line 5
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    :goto_0
    return-void
.end method
