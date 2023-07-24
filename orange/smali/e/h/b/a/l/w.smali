.class public final synthetic Le/h/b/a/l/w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field private final synthetic b:Lcom/orange/hce/proto/activity/LegalInformationActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/LegalInformationActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/w;->b:Lcom/orange/hce/proto/activity/LegalInformationActivity;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, Le/h/b/a/l/w;->b:Lcom/orange/hce/proto/activity/LegalInformationActivity;

    invoke-virtual {v0, p1}, Lcom/orange/hce/proto/activity/LegalInformationActivity;->b(Landroid/view/View;)Z

    move-result p1

    return p1
.end method
