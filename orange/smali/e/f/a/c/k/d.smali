.class public abstract Le/f/a/c/k/d;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public a:Le/f/a/c/k/e;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le/f/a/c/k/d;->b:I

    .line 3
    iput v0, p0, Le/f/a/c/k/d;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Le/f/a/c/k/d;->b:I

    .line 6
    iput p1, p0, Le/f/a/c/k/d;->c:I

    return-void
.end method


# virtual methods
.method public a(I)Z
    .locals 1

    .line 11
    iget-object v0, p0, Le/f/a/c/k/d;->a:Le/f/a/c/k/e;

    if-eqz v0, :cond_0

    .line 12
    invoke-virtual {v0, p1}, Le/f/a/c/k/e;->b(I)Z

    move-result p1

    return p1

    .line 13
    :cond_0
    iput p1, p0, Le/f/a/c/k/d;->b:I

    const/4 p1, 0x0

    return p1
.end method

.method public a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Le/f/a/c/k/d;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    .line 2
    iget-object p1, p0, Le/f/a/c/k/d;->a:Le/f/a/c/k/e;

    if-nez p1, :cond_0

    .line 3
    new-instance p1, Le/f/a/c/k/e;

    invoke-direct {p1, p2}, Le/f/a/c/k/e;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Le/f/a/c/k/d;->a:Le/f/a/c/k/e;

    .line 4
    :cond_0
    iget-object p1, p0, Le/f/a/c/k/d;->a:Le/f/a/c/k/e;

    invoke-virtual {p1}, Le/f/a/c/k/e;->b()V

    .line 5
    iget p1, p0, Le/f/a/c/k/d;->b:I

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 6
    iget-object p3, p0, Le/f/a/c/k/d;->a:Le/f/a/c/k/e;

    invoke-virtual {p3, p1}, Le/f/a/c/k/e;->b(I)Z

    .line 7
    iput p2, p0, Le/f/a/c/k/d;->b:I

    .line 8
    :cond_1
    iget p1, p0, Le/f/a/c/k/d;->c:I

    if-eqz p1, :cond_2

    .line 9
    iget-object p3, p0, Le/f/a/c/k/d;->a:Le/f/a/c/k/e;

    invoke-virtual {p3, p1}, Le/f/a/c/k/e;->a(I)Z

    .line 10
    iput p2, p0, Le/f/a/c/k/d;->c:I

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public b()I
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/a/c/k/d;->a:Le/f/a/c/k/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/f/a/c/k/e;->a()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->d(Landroid/view/View;I)V

    return-void
.end method
