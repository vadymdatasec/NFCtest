.class public Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/i;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Le/h/b/a/m/d;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/widget/PackIdWidgetProvider;Le/h/b/a/m/d;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a;->b:Le/h/b/a/m/d;

    iput-object p3, p0, Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a;->b:Le/h/b/a/m/d;

    sget-object v1, Le/h/b/a/m/i;->d:Le/h/b/a/m/i;

    invoke-virtual {v0, v1}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Le/h/b/a/q/d;->c(Landroid/content/Context;)V

    return-void
.end method
