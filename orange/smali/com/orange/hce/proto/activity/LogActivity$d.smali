.class public Lcom/orange/hce/proto/activity/LogActivity$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/widget/ScrollView;)Landroid/content/BroadcastReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Landroid/widget/ScrollView;

.field public final synthetic c:Lcom/orange/hce/proto/activity/LogActivity;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/activity/LogActivity;Landroid/widget/TextView;Landroid/widget/ScrollView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->c:Lcom/orange/hce/proto/activity/LogActivity;

    iput-object p2, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->a:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->b:Landroid/widget/ScrollView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const-string v0, "LogServiceMessage"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "LogServiceTimeStamp"

    .line 2
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "LogServiceShouldWrite"

    const/4 v3, 0x1

    .line 3
    invoke-virtual {p2, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "LogServiceColor"

    const v4, -0xffff01

    .line 4
    invoke-virtual {p2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 5
    iget-object v3, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->a:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->b:Landroid/widget/ScrollView;

    invoke-virtual {v4}, Landroid/widget/ScrollView;->getHeight()I

    move-result v4

    sub-int/2addr v3, v4

    .line 6
    iget-object v4, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->c:Lcom/orange/hce/proto/activity/LogActivity;

    iget-object v5, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->a:Landroid/widget/TextView;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\n"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v5, v6, p2}, Lcom/orange/hce/proto/activity/LogActivity;->a(Lcom/orange/hce/proto/activity/LogActivity;Landroid/widget/TextView;Ljava/lang/String;I)V

    if-lez v3, :cond_0

    .line 7
    iget-object p2, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->b:Landroid/widget/ScrollView;

    invoke-virtual {p2}, Landroid/widget/ScrollView;->getScrollY()I

    move-result p2

    int-to-float p2, p2

    int-to-float v3, v3

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v4, p1}, Lcom/orange/hce/proto/activity/LogActivity;->a(FLandroid/content/Context;)F

    move-result p1

    sub-float/2addr v3, p1

    cmpl-float p1, p2, v3

    if-ltz p1, :cond_0

    .line 8
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->b:Landroid/widget/ScrollView;

    const/16 p2, 0x82

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->fullScroll(I)Z

    .line 9
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 10
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$d;->c:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/LogActivity;->c(Lcom/orange/hce/proto/activity/LogActivity;)Le/h/b/a/l/a1;

    move-result-object p1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
