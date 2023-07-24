.class public final synthetic Le/f/c/u/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/k;


# static fields
.field public static final a:Le/f/c/k/k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/u/r;

    invoke-direct {v0}, Le/f/c/u/r;-><init>()V

    sput-object v0, Le/f/c/u/r;->a:Le/f/c/k/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le/f/c/k/f;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0$FirebaseMessagingRegistrar(Le/f/c/k/f;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p1

    return-object p1
.end method
