.class public Lcom/orange/hce/proto/activity/LogActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/hce/proto/activity/LogActivity;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/orange/hce/proto/activity/LogActivity;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/activity/LogActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$b;->b:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$b;->b:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/LogActivity;->c(Lcom/orange/hce/proto/activity/LogActivity;)Le/h/b/a/l/a1;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "=== Log session finished on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v3, "HH:mm:ss yyyy/MM/dd"

    invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ==="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/h/b/a/l/a1;->a(Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/orange/hce/proto/activity/LogActivity$b;->b:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/LogActivity;->d(Lcom/orange/hce/proto/activity/LogActivity;)V

    return-void
.end method
