.class public final synthetic Le/h/b/a/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic b:I

.field private final synthetic c:Lcom/orange/hce/proto/activity/PermissionsActivity;

.field private final synthetic d:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILcom/orange/hce/proto/activity/PermissionsActivity;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le/h/b/a/c;->b:I

    iput-object p2, p0, Le/h/b/a/c;->c:Lcom/orange/hce/proto/activity/PermissionsActivity;

    iput-object p3, p0, Le/h/b/a/c;->d:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget v0, p0, Le/h/b/a/c;->b:I

    iget-object v1, p0, Le/h/b/a/c;->c:Lcom/orange/hce/proto/activity/PermissionsActivity;

    iget-object v2, p0, Le/h/b/a/c;->d:[Ljava/lang/String;

    invoke-static {v0, v1, v2, p1, p2}, Le/h/b/a/h;->a(ILcom/orange/hce/proto/activity/PermissionsActivity;[Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method
