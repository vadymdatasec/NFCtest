.class public Lcom/orange/hce/proto/widget/PackIdWidgetService;
.super Landroid/widget/RemoteViewsService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/hce/proto/widget/PackIdWidgetService$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/RemoteViewsService;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetViewFactory(Landroid/content/Intent;)Landroid/widget/RemoteViewsService$RemoteViewsFactory;
    .locals 1

    .line 1
    new-instance p1, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;

    invoke-virtual {p0}, Landroid/widget/RemoteViewsService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;-><init>(Landroid/content/Context;)V

    return-object p1
.end method
