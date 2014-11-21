/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_cablelabs_vpbapi_VpbAPI */

#ifndef _Included_com_cablelabs_vpbapi_VpbAPI
#define _Included_com_cablelabs_vpbapi_VpbAPI
#ifdef __cplusplus
extern "C" {
#endif
#undef com_cablelabs_vpbapi_VpbAPI_BOARD
#define com_cablelabs_vpbapi_VpbAPI_BOARD 1L
#undef com_cablelabs_vpbapi_VpbAPI_CHANNELS
#define com_cablelabs_vpbapi_VpbAPI_CHANNELS 4L
/*
 * Class:     com_cablelabs_vpbapi_VpbAPI
 * Method:    open_card
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_cablelabs_vpbapi_VpbAPI_open_1card
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_cablelabs_vpbapi_VpbAPI
 * Method:    close_card
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_cablelabs_vpbapi_VpbAPI_close_1card
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_cablelabs_vpbapi_VpbAPI
 * Method:    onhook_channel
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_cablelabs_vpbapi_VpbAPI_onhook_1channel
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_cablelabs_vpbapi_VpbAPI
 * Method:    offhook_channel
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_cablelabs_vpbapi_VpbAPI_offhook_1channel
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_cablelabs_vpbapi_VpbAPI
 * Method:    dial_channel
 * Signature: (ILjava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_cablelabs_vpbapi_VpbAPI_dial_1channel
  (JNIEnv *, jobject, jint, jstring);

/*
 * Class:     com_cablelabs_vpbapi_VpbAPI
 * Method:    hookflash_channel
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_com_cablelabs_vpbapi_VpbAPI_hookflash_1channel
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_cablelabs_vpbapi_VpbAPI
 * Method:    getEvent
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_cablelabs_vpbapi_VpbAPI_getEvent
  (JNIEnv *, jobject, jint);

#ifdef __cplusplus
}
#endif
#endif