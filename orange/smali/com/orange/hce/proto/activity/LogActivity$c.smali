.class public Lcom/orange/hce/proto/activity/LogActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/hce/proto/activity/LogActivity;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/orange/hce/proto/activity/LogActivity;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/activity/LogActivity;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$c;->c:Lcom/orange/hce/proto/activity/LogActivity;

    iput p2, p0, Lcom/orange/hce/proto/activity/LogActivity$c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity$c;->c:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v1}, Lcom/orange/hce/proto/activity/LogActivity;->e(Lcom/orange/hce/proto/activity/LogActivity;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/orange/hce/proto/activity/LogActivity$c;->c:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v1}, Lcom/orange/hce/proto/activity/LogActivity;->e(Lcom/orange/hce/proto/activity/LogActivity;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Le/h/b/a/l/e1;

    invoke-virtual {v1}, Le/h/b/a/l/e1;->a()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/orange/hce/proto/activity/LogActivity$c;->c:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {v0}, Lcom/orange/hce/proto/activity/LogActivity;->f(Lcom/orange/hce/proto/activity/LogActivity;)Landroid/os/Handler;

    move-result-object v0

    iget v1, p0, Lcom/orange/hce/proto/activity/LogActivity$c;->b:I

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
