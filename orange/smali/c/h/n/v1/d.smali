.class public final Lc/h/n/v1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final a:Lc/h/n/v1/c;


# direct methods
.method public constructor <init>(Lc/h/n/v1/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/h/n/v1/d;->a:Lc/h/n/v1/c;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Lc/h/n/v1/d;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    check-cast p1, Lc/h/n/v1/d;

    .line 3
    iget-object v0, p0, Lc/h/n/v1/d;->a:Lc/h/n/v1/c;

    iget-object p1, p1, Lc/h/n/v1/d;->a:Lc/h/n/v1/c;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/v1/d;->a:Lc/h/n/v1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public onTouchExplorationStateChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/h/n/v1/d;->a:Lc/h/n/v1/c;

    invoke-interface {v0, p1}, Lc/h/n/v1/c;->onTouchExplorationStateChanged(Z)V

    return-void
.end method
