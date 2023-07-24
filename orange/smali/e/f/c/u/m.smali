.class public final synthetic Le/f/c/u/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/a;


# static fields
.field public static final a:Le/f/a/b/h/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/u/m;

    invoke-direct {v0}, Le/f/c/u/m;-><init>()V

    sput-object v0, Le/f/c/u/m;->a:Le/f/a/b/h/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->a(Le/f/a/b/h/g;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
