.class public abstract Le/h/b/a/p/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/content/IntentFilter;

.field public static final b:Landroid/content/IntentFilter;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Le/h/b/a/p/l;->a()Landroid/content/IntentFilter;

    move-result-object v0

    sput-object v0, Le/h/b/a/p/l;->a:Landroid/content/IntentFilter;

    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    sput-object v0, Le/h/b/a/p/l;->b:Landroid/content/IntentFilter;

    return-void
.end method

.method public static a()Landroid/content/IntentFilter;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.orange.oab.contactless.packid.action.USER_UPDATED"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-object v0
.end method
