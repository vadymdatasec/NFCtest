.class public final synthetic Le/h/b/a/l/z;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private final synthetic a:Lcom/orange/hce/proto/activity/LogActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/LogActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/z;->a:Lcom/orange/hce/proto/activity/LogActivity;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Le/h/b/a/l/z;->a:Lcom/orange/hce/proto/activity/LogActivity;

    invoke-virtual {v0, p1, p2}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/widget/CompoundButton;Z)V

    return-void
.end method
