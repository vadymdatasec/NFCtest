.class public abstract Lc/v/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/view/View;)Lc/v/d0;
    .locals 1

    .line 2
    sget v0, Lc/v/b0;->transition_current_scene:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/v/d0;

    return-object p0
.end method

.method public static a(Landroid/view/View;Lc/v/d0;)V
    .locals 1

    .line 1
    sget v0, Lc/v/b0;->transition_current_scene:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method
