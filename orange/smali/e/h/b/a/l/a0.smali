.class public final synthetic Le/h/b/a/l/a0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/orange/hce/proto/activity/NoBadgeActivity;

.field private final synthetic c:Landroid/app/ProgressDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/NoBadgeActivity;Landroid/app/ProgressDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/a0;->b:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    iput-object p2, p0, Le/h/b/a/l/a0;->c:Landroid/app/ProgressDialog;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/h/b/a/l/a0;->b:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    iget-object v1, p0, Le/h/b/a/l/a0;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v0, v1}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->a(Landroid/app/ProgressDialog;)V

    return-void
.end method
