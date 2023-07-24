.class public final Le/e/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Le/e/a/b;


# direct methods
.method public constructor <init>(Le/e/a/b;)V
    .locals 0

    iput-object p1, p0, Le/e/a/d;->b:Le/e/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Le/e/a/d;->b:Le/e/a/b;

    invoke-virtual {p1}, Le/e/a/b;->g()Le/e/a/u;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Le/e/a/u;->b()V

    :cond_0
    return-void
.end method
