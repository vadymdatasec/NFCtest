.class public Lcom/orange/oab/contactless/packid/service/PackIdService$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/service/PackIdService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/orange/oab/contactless/packid/service/PackIdService;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$a;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$a;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-static {p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lcom/orange/oab/contactless/packid/service/PackIdService;)Le/h/d/a/a/w/u;

    move-result-object p1

    invoke-virtual {p1}, Le/h/d/a/a/w/u;->a()V

    .line 2
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$a;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-static {p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lcom/orange/oab/contactless/packid/service/PackIdService;)Le/h/d/a/a/w/u;

    move-result-object p1

    invoke-virtual {p1}, Le/h/d/a/a/w/u;->b()V

    return-void
.end method
