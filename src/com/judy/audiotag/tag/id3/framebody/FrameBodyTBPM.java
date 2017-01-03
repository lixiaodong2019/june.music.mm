/*
 *  MusicTag Copyright (C)2003,2004
 *
 *  This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser
 *  General Public  License as published by the Free Software Foundation; either version 2.1 of the License,
 *  or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 *  the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License along with this library; if not,
 *  you can get a copy from http://www.opensource.org/licenses/lgpl-license.php or write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package com.judy.audiotag.tag.id3.framebody;

import com.judy.audiotag.tag.InvalidTagException;
import com.judy.audiotag.tag.id3.ID3v24Frames;

import java.nio.ByteBuffer;

/**
 * Beats Per Minute Text information frame.
 * <p>
 * The 'BPM' frame contains the number of beats per minute in the mainpart of
 * the audio. The BPM is an integer and represented as a numerical string.
 * 
 * <p>
 * For more details, please refer to the ID3 specifications:
 * <ul>
 * <li><a href="http://www.id3.org/id3v2.3.0.txt">ID3 v2.3.0 Spec</a>
 * </ul>
 * 
 * @author : Paul Taylor
 * @author : Eric Farng
 * @version $Id: FrameBodyTBPM.java,v 1.10 2006/08/27 18:12:36 paultaylor Exp $
 */
public class FrameBodyTBPM extends AbstractFrameBodyTextInfo implements ID3v24FrameBody, ID3v23FrameBody {
	/**
	 * Creates a new FrameBodyTBPM datatype.
	 */
	public FrameBodyTBPM() {
	}

	public FrameBodyTBPM(FrameBodyTBPM body) {
		super(body);
	}

	/**
	 * Creates a new FrameBodyTBPM datatype.
	 *
	 * @param textEncoding
	 * @param text
	 */
	public FrameBodyTBPM(byte textEncoding, String text) {
		super(textEncoding, text);
	}

	/**
	 * Creates a new FrameBodyTBPM datatype.
	 * 
	 * @throws InvalidTagException
	 */
	public FrameBodyTBPM(ByteBuffer byteBuffer, int frameSize) throws InvalidTagException {
		super(byteBuffer, frameSize);
	}

	/**
	 * The ID3v2 frame identifier
	 *
	 * @return the ID3v2 frame identifier for this frame type
	 */
	public String getIdentifier() {
		return ID3v24Frames.FRAME_ID_BPM;
	}
}