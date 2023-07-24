.class public final synthetic Le/h/b/a/l/y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Le/g/a/a/b$a;


# instance fields
.field private final synthetic a:Lcom/orange/hce/proto/activity/LogActivity;

.field private final synthetic b:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/LogActivity;Landroid/content/SharedPreferences;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/y;->a:Lcom/orange/hce/proto/activity/LogActivity;

    iput-object p2, p0, Le/h/b/a/l/y;->b:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final a(Le/g/a/a/b$b;Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Le/h/b/a/l/y;->a:Lcom/orange/hce/proto/activity/LogActivity;

    iget-object v1, p0, Le/h/b/a/l/y;->b:Landroid/content/SharedPreferences;

    invoke-virtual {v0, v1, p1, p2}, Lcom/orange/hce/proto/activity/LogActivity;->a(Landroid/content/SharedPreferences;Le/g/a/a/b$b;Ljava/lang/Exception;)V

    return-void
.end method
