.class public final Le/e/a/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Le/e/a/o;


# direct methods
.method public constructor <init>(Le/e/a/o;)V
    .locals 0

    iput-object p1, p0, Le/e/a/j;->b:Le/e/a/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Le/e/a/j;->b:Le/e/a/o;

    invoke-static {p1}, Le/e/a/o;->g(Le/e/a/o;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Le/e/a/j;->b:Le/e/a/o;

    invoke-virtual {p1}, Le/e/a/o;->b()V

    .line 3
    :cond_0
    iget-object p1, p0, Le/e/a/j;->b:Le/e/a/o;

    invoke-static {p1}, Le/e/a/o;->f(Le/e/a/o;)Le/e/a/r;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Le/e/a/j;->b:Le/e/a/o;

    invoke-interface {p1, v0}, Le/e/a/r;->c(Le/e/a/o;)V

    :cond_1
    return-void
.end method
