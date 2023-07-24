.class public final Le/e/a/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Le/e/a/q;

.field public final synthetic c:Le/e/a/o;

.field public final synthetic d:Landroid/view/View;


# direct methods
.method public constructor <init>(Le/e/a/q;Le/e/a/o;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Le/e/a/p;->b:Le/e/a/q;

    iput-object p2, p0, Le/e/a/p;->c:Le/e/a/o;

    iput-object p3, p0, Le/e/a/p;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/e/a/p;->c:Le/e/a/o;

    invoke-virtual {v0}, Le/e/a/o;->k()V

    .line 2
    iget-object v0, p0, Le/e/a/p;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Le/e/a/p;->b:Le/e/a/q;

    invoke-static {v1}, Le/e/a/q;->a(Le/e/a/q;)Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method
